package com.algolia.search.filter

import com.algolia.search.model.Attribute


public sealed class Filter {

    abstract val attribute: Attribute

    internal abstract val expression: String

    var isNegated = false
        private set

    operator fun not(): Filter {
        isNegated = !isNegated
        return this
    }

    operator fun unaryPlus(): Filter {
        isNegated = false
        return this
    }

    operator fun unaryMinus(): Filter {
        isNegated = true
        return this
    }

    fun build() = if (isNegated) "NOT $expression" else expression
}

public data class FilterTag(
    val value: String
) : Filter() {

    override val attribute = Attribute("_tags")
    override val expression = "$attribute:\"$value\""

    override fun toString(): String {
        return "FilterTag($expression)"
    }
}

public sealed class FilterNumeric : Filter() {

    override fun toString(): String {
        return "FilterNumeric($expression)"
    }
}

public data class FilterComparison(
    override val attribute: Attribute,
    val operator: NumericOperator,
    val value: Number
) : FilterNumeric() {

    override val expression = "${attribute.escape()} ${operator.raw} $value"

    override fun toString(): String {
        return "FilterComparison($expression)"
    }
}

public data class FilterRange(
    override val attribute: Attribute,
    val lowerBound: Number,
    val upperBound: Number
) : FilterNumeric() {

    override val expression = "${attribute.escape()}:$lowerBound TO $upperBound"

    override fun toString(): String {
        return "FilterRange($expression)"
    }
}

public data class FilterFacet internal constructor(
    override val attribute: Attribute,
    private val value: FacetValue<*>,
    private val score: Int? = null
) : Filter() {

    public constructor(attribute: Attribute, value: String, score: Int? = null) : this(
        attribute,
        FacetValue.String(value),
        score
    )

    public constructor(attribute: Attribute, value: Boolean, score: Int? = null) : this(
        attribute,
        FacetValue.Boolean(value),
        score
    )

    public constructor(attribute: Attribute, value: Number, score: Int? = null) : this(
        attribute,
        FacetValue.Number(value),
        score
    )

    override val expression: String = "${attribute.escape()}:${value.escape()}" + if (score != null) "<score=$score>" else ""

    override fun toString(): String {
        return "FilterFacet($expression)"
    }
}

internal sealed class FacetValue<T> {

    abstract val value: T

    fun escape(): kotlin.String {
        return when (this) {
            is String -> "\"$value\""
            is Boolean -> value.toString()
            is Number -> value.toString()
        }
    }

    data class String(override val value: kotlin.String) : FacetValue<kotlin.String>()

    data class Boolean(override val value: kotlin.Boolean) : FacetValue<kotlin.Boolean>()

    data class Number(override val value: kotlin.Number) : FacetValue<kotlin.Number>()
}

internal fun Attribute.escape() = "\"$raw\""

internal fun String.escape() = "\"$this\""