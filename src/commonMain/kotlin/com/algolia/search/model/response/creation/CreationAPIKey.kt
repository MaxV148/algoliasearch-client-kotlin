package com.algolia.search.model.response.creation

import com.algolia.search.model.APIKey
import com.algolia.search.model.ClientDate
import com.algolia.search.serialize.KeyCreatedAt
import com.algolia.search.serialize.KeyKey
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
public data class CreationAPIKey(
    @SerialName(KeyCreatedAt) val createdAt: ClientDate,
    @SerialName(KeyKey) val apiKey: APIKey
)