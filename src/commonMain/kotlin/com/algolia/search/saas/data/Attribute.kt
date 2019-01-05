package com.algolia.search.saas.data

import com.algolia.search.saas.toAttribute
import kotlinx.serialization.Decoder
import kotlinx.serialization.Encoder
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.internal.StringSerializer


@Serializable(Attribute.Companion::class)
data class Attribute(override val raw: String) : Raw<String> {

    override fun toString(): String {
        return raw
    }

    internal companion object : KSerializer<Attribute> {

        private val serializer = StringSerializer

        override val descriptor = serializer.descriptor

        override fun serialize(encoder: Encoder, obj: Attribute) {
            serializer.serialize(encoder, obj.raw)
        }

        override fun deserialize(decoder: Decoder): Attribute {
            return serializer.deserialize(decoder).toAttribute()
        }
    }
}