package com.algolia.search.configuration

import com.algolia.search.model.internal.Raw
import com.algolia.search.serialize.KeyDE
import com.algolia.search.serialize.KeyEU
import com.algolia.search.serialize.KeyUS

/**
 * Region configuration, used in some [Configuration] implementations.
 */
public sealed class Region {

    /**
     * Available analytics' regions, used in [ConfigurationAnalytics].
     */
    public sealed class Analytics(override val raw: String) : Raw<String> {

        public object EU : Analytics(KeyDE)
        public object US : Analytics(KeyUS)
        public class Other(override val raw: String) : Analytics(raw)

        override fun toString(): String = raw
    }

    /**
     * Available regions, used in [ConfigurationPersonalization].
     */
    public sealed class Personalization(override val raw: String) : Raw<String> {

        public object EU : Personalization(KeyEU)
        public object US : Personalization(KeyUS)
        public class Other(override val raw: String) : Personalization(raw)

        override fun toString(): String = raw
    }
}
