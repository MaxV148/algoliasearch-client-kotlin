package suite

import clientAdmin1
import com.algolia.search.exception.AlgoliaApiException
import com.algolia.search.helper.toObjectID
import com.algolia.search.model.rule.Rule
import com.algolia.search.model.synonym.Synonym
import com.algolia.search.model.task.Task
import com.algolia.search.model.task.TaskStatus
import com.algolia.search.serialize.KeyObjectID
import io.ktor.http.HttpStatusCode
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.put
import runBlocking
import shouldBeTrue
import shouldEqual
import shouldFailWith
import kotlin.test.Test

class TestSuiteReplaceAll {

    private val suffix = "replacing"
    private val indexName = testSuiteIndexName(suffix)
    private val index = clientAdmin1.initIndex(indexName)
    private val objectIDOne = "one".toObjectID()
    private val objectIDTwo = "two".toObjectID()

    @Test
    fun test() {
        runBlocking {
            val rule = load(Rule.serializer(), "rule_one.json")
            val synonym = load(Synonym, "synonym_one.json") as Synonym.MultiWay
            val data = buildJsonObject { KeyObjectID to objectIDOne }

            index.apply {
                val tasks = mutableListOf<Task>()

                tasks += saveObject(data)
                tasks += saveSynonym(synonym)
                tasks += saveRule(rule)

                tasks.wait().all { it is TaskStatus.Published }.shouldBeTrue()
                tasks.clear()

                tasks += replaceAllObjects(listOf(buildJsonObject { put(KeyObjectID, objectIDTwo.raw) }))
                tasks += replaceAllSynonyms(listOf(synonym.copy(objectID = objectIDTwo)))
                tasks += replaceAllRules(listOf(rule.copy(objectID = objectIDTwo)))

                tasks.wait().all { it is TaskStatus.Published }.shouldBeTrue()

                getObject(objectIDTwo).getValue(KeyObjectID).jsonPrimitive.content shouldEqual objectIDTwo.raw
                getRule(objectIDTwo).objectID shouldEqual objectIDTwo
                getSynonym(objectIDTwo).objectID shouldEqual objectIDTwo

                (
                    shouldFailWith<AlgoliaApiException> {
                        getObject(objectIDOne)
                    }
                    ).httpErrorCode shouldEqual HttpStatusCode.NotFound.value

                (
                    shouldFailWith<AlgoliaApiException> {
                        getSynonym(objectIDOne)
                    }
                    ).httpErrorCode shouldEqual HttpStatusCode.NotFound.value

                (
                    shouldFailWith<AlgoliaApiException> {
                        getRule(objectIDOne)
                    }
                    ).httpErrorCode shouldEqual HttpStatusCode.NotFound.value
            }
        }
    }
}
