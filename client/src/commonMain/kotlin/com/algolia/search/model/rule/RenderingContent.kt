package com.algolia.search.model.rule

import com.algolia.search.serialize.KeyFacetOrdering
import com.algolia.search.serialize.KeyRedirect
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Content defining how the search interface should be rendered.
 * This is set via the settings for a default value and can be overridden via rules.
 */
@Serializable
public data class RenderingContent(
    /**
     * Defining how facets should be ordered.
     */
    @SerialName(KeyFacetOrdering) public val facetOrdering: FacetOrdering? = null,
    /**
     * Redirect data container.
     */
    @SerialName(KeyRedirect) public val redirect: Redirect? = null
)
