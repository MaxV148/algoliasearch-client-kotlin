package com.algolia.search.saas.data

import com.algolia.search.saas.serialize.KeyNone
import com.algolia.search.saas.serialize.KeyStopIfEnoughMatches
import kotlinx.serialization.Decoder
import kotlinx.serialization.Encoder
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.internal.StringSerializer


@Serializable(MultipleQueriesStrategy.Companion::class)
sealed class MultipleQueriesStrategy(override val raw: String) : Raw<String> {

    object None : MultipleQueriesStrategy(KeyNone)

    object StopIfEnoughMatches : MultipleQueriesStrategy(KeyStopIfEnoughMatches)

    data class Unknown(override val raw: String) : MultipleQueriesStrategy(raw)

    override fun toString(): String {
        return raw
    }

    internal companion object : KSerializer<MultipleQueriesStrategy> {

        private val serializer = StringSerializer

        override val descriptor = serializer.descriptor

        override fun serialize(encoder: Encoder, obj: MultipleQueriesStrategy) {
            serializer.serialize(encoder, obj.raw)
        }

        override fun deserialize(decoder: Decoder): MultipleQueriesStrategy {
            val string = serializer.deserialize(decoder)

            return when (string) {
                KeyNone -> None
                KeyStopIfEnoughMatches -> StopIfEnoughMatches
                else -> Unknown(string)
            }
        }
    }
}