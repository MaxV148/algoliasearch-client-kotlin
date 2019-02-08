package suite

import com.algolia.search.model.AttributeForFaceting
import com.algolia.search.model.queryrule.QueryRule
import com.algolia.search.model.settings.Settings
import com.algolia.search.model.task.Task
import com.algolia.search.model.task.TaskStatus
import com.algolia.search.toAttribute
import io.ktor.client.features.BadResponseStatusException
import io.ktor.http.HttpStatusCode
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.Json
import kotlinx.serialization.list
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import shouldBeTrue
import shouldEqual
import shouldNotBeNull


@RunWith(JUnit4::class)
internal class TestSuiteQueryRules {

    private val suffix = "rules"
    private val indexName = testSuiteIndexName(suffix)
    private val json = Json(indented = true, indent = "  ", encodeDefaults = false)
    private val brand = "brand".toAttribute()

    lateinit var queryRule: QueryRule
    lateinit var queryRules: List<QueryRule>

    @Before
    fun clean() {
        cleanIndex(suffix)
    }

    @Before
    fun queryRule() {
        val string = loadScratch("suite_query_rule_1.json").readText()
        queryRule = json.parse(QueryRule.serializer(), string)
        val serialized = json.stringify(QueryRule.serializer(), queryRule)

        serialized shouldEqual string
    }

    @Before
    fun queryRules() {
        val string = loadScratch("suite_query_rule_2.json").readText()
        queryRules = json.parse(QueryRule.serializer().list, string)
        val serialized = json.stringify(QueryRule.serializer().list, queryRules)

        serialized shouldEqual string
    }

    @Test
    fun suite() {
        runBlocking {
            val index = clientAdmin1.getIndex(indexName)
            val objects = loadScratch("iphones.json").readText().let {
                Json.plain.parseJson(it).jsonArray.map { it.jsonObject }
            }
            val tasks = mutableListOf<Task>()

            index.apply {
                tasks += addObjects(objects)
                tasks += setSettings(Settings(attributesForFaceting = listOf(AttributeForFaceting.Default(brand))))
                tasks += saveRule(queryRule)
                tasks += saveRules(queryRules)

                tasks.wait().all { it is TaskStatus.Published }

                getRule(queryRule.objectID) shouldEqual queryRule
                queryRules.forEach { getRule(it.objectID) shouldEqual it }
                val searches = searchRules().hits

                searches.find { it.objectID == queryRule.objectID }.shouldNotBeNull()
                searches.find { it.objectID == queryRules.first().objectID }.shouldNotBeNull()
                deleteRule(queryRule.objectID).wait() shouldEqual TaskStatus.Published
                var isNotfound = false
                try {
                    getRule(queryRule.objectID)
                } catch (exception: BadResponseStatusException) {
                    isNotfound = exception.statusCode == HttpStatusCode.NotFound
                }
                isNotfound.shouldBeTrue()
                clearRules().wait() shouldEqual TaskStatus.Published
                searchRules().nbHits shouldEqual 0
            }
        }
    }
}