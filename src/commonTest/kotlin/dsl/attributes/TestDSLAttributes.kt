package dsl.attributes

import attributeA
import attributeB
import com.algolia.search.dsl.attributes.DSLAttributes
import kotlin.test.Test
import shouldEqual

internal class TestDSLAttributes {

    @Test
    fun default() {
        val dsl = DSLAttributes {
            +"attributeA"
            +attributeB
        }

        dsl shouldEqual listOf(attributeA, attributeB)
    }
}
