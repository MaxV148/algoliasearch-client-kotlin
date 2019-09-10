package com.algolia.search.model.rule

import com.algolia.search.model.search.Query
import com.algolia.search.serialize.*
import kotlinx.serialization.*
import kotlinx.serialization.json.json
import kotlin.jvm.JvmOverloads


@Serializable(Edit.Companion::class)
public data class Edit @JvmOverloads constructor(
    /**
     * Text or patterns to remove from the [Query.query].
     */
    val delete: String,
    /**
     * Text that should be inserted in place of the removed text inside the [Query.query].
     */
    val insert: String? = null
) {

    @Serializer(Edit::class)
    companion object : KSerializer<Edit> {

        override fun serialize(encoder: Encoder, obj: Edit) {
            val type = if (obj.insert != null) KeyReplace else KeyRemoveLowercase
            val json = json {
                KeyType to type.toLowerCase()
                KeyDelete to obj.delete
                obj.insert?.let { KeyInsert to it }
            }

            encoder.asJsonOutput().encodeJson(json)
        }

        override fun deserialize(decoder: Decoder): Edit {
            val json = decoder.asJsonInput().jsonObject

            return Edit(
                json.getPrimitive(KeyDelete).content,
                json.getPrimitiveOrNull(KeyInsert)?.content
            )
        }
    }
}