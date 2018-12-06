import client.query.helper.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertEquals


@RunWith(JUnit4::class)
class TestHelper {

    private val attributeA = Attribute("attributeA")
    private val attributeB = Attribute("attributeB")
    private val attributeC = Attribute("attributeC")
    private val groupA = Group("groupA")
    private val groupB = Group("groupB")
    private val filterA = FilterFacet(attributeA, "facetA", group = groupA)
    private val filterB = FilterFacet(attributeA, "facetB", group = groupA)
    private val filterC = FilterBoolean(attributeC, true, group = groupB)
    private val filterD = FilterTag("tag")
    private val filterE = FilterComparison(attributeB, NumericOperator.Equals, 5.0, group = groupA)

    private fun filters(): Filters<Filter> = mutableListOf()

    private fun <T : Filter> list(vararg filter: T) = listOf<Filter>(*filter)

    @Test
    fun and() {
        filters().apply {
            and(filterA)
            assertEquals(listOf(list(filterA)), this)
            and(filterB, filterC)
            assertEquals(listOf(list(filterA), list(filterB), list(filterC)), this)
        }
    }

    @Test
    fun or() {
        filters().apply {
            or(filterA, filterB, filterC)
            assertEquals(listOf(list(filterA, filterB, filterC)), this)
            or(filterD, filterE)
            assertEquals(listOf(list(filterA, filterB, filterC), list(filterD, filterE)), this)
        }
    }

    @Test
    fun replace() {
        filters().apply {
            replace(filterA, filterB)
            assertEquals(filters(), this)
            and(filterA, filterA, filterC)
            replace(filterA, filterB)
            assertEquals(listOf(list(filterB), list(filterB), list(filterC)), this)
        }
    }

    @Test
    fun remove() {
        filters().apply {
            remove(filterA, filterB)
            assertEquals(filters(), this)
            and(filterA, filterA, filterC)
            remove(filterA, filterB)
            assertEquals(listOf(list(filterC)), this)
        }
    }

    @Test
    fun getFilters() {
        filters().apply {
            assertEquals(list<Filter>(), this.getFilters(groupA))
            and(filterA, filterB)
            or(filterC, filterD, filterE)
            assertEquals(listOf(filterA, filterB, filterE), this.getFilters(groupA))
            assertEquals(listOf(filterC), this.getFilters(groupB))
        }
    }

    @Test
    fun clear() {
        filters().apply {
            and(filterA, filterC)
            clear(groupA)
            assertEquals(listOf(list(filterC)), this)
            clear(null)
            assertEquals(filters(), this)
        }
    }

    @Test
    fun replaceAttribute() {
        filters().apply {
            or(filterA, filterB, filterC, filterE)
            replaceAttribute(attributeA, attributeB)
            assertEquals(
                listOf(
                    list(
                        filterA.modifyAttribute(attributeB),
                        filterB.modifyAttribute(attributeB),
                        filterC,
                        filterE
                    )
                ), this
            )
            replaceAttribute(attributeB, attributeC, groupA)
            assertEquals(
                listOf(
                    list(
                        filterA.modifyAttribute(attributeC),
                        filterB.modifyAttribute(attributeC),
                        filterC,
                        filterE.modifyAttribute(attributeC)
                    )
                ), this
            )
        }
    }
}