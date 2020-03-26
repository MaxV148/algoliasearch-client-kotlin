package serialize

import com.algolia.search.serialize.*
import shouldEqual
import kotlin.test.Test


internal class TestKeys {

    @Test
    fun keys() {
        KeyQuery shouldEqual "query"
        KeySearchableAttributes shouldEqual "searchableAttributes"
        KeyAttributesForFaceting shouldEqual "attributesForFaceting"
        KeyUnretrievableAttributes shouldEqual "unretrievableAttributes"
        KeyAttributesToRetrieve shouldEqual "attributesToRetrieve"
        KeyRestrictSearchableAttributes shouldEqual "restrictSearchableAttributes"
        KeyRanking shouldEqual "ranking"
        KeyCustomRanking shouldEqual "customRanking"
        KeyReplicas shouldEqual "replicas"
        KeyFilters shouldEqual "filters"
        KeyFacetFilters shouldEqual "facetFilters"
        KeyOptionalFilters shouldEqual "optionalFilters"
        KeyNumericFilters shouldEqual "numericFilters"
        KeyTagFilters shouldEqual "tagFilters"
        KeySumOrFiltersScores shouldEqual "sumOrFiltersScores"
        KeyFacets shouldEqual "facets"
        KeyMaxValuesPerFacet shouldEqual "maxValuesPerFacet"
        KeyFacetingAfterDistinct shouldEqual "facetingAfterDistinct"
        KeySortFacetValuesBy shouldEqual "sortFacetValuesBy"
        KeyAttributesToHighlight shouldEqual "attributesToHighlight"
        KeyAttributesToSnippet shouldEqual "attributesToSnippet"
        KeyHighlightPreTag shouldEqual "highlightPreTag"
        KeyHighlightPostTag shouldEqual "highlightPostTag"
        KeySnippetEllipsisText shouldEqual "snippetEllipsisText"
        KeyRestrictHighlightAndSnippetArrays shouldEqual "restrictHighlightAndSnippetArrays"
        KeyPage shouldEqual "page"
        KeyHitsPerPage shouldEqual "hitsPerPage"
        KeyOffset shouldEqual "offset"
        KeyLength shouldEqual "length"
        KeyPaginationLimitedTo shouldEqual "paginationLimitedTo"
        KeyMinWordSizeFor1Typo shouldEqual "minWordSizefor1Typo"
        KeyMinWordSizeFor2Typos shouldEqual "minWordSizefor2Typos"
        KeyTypoTolerance shouldEqual "typoTolerance"
        KeyAllowTyposOnNumericTokens shouldEqual "allowTyposOnNumericTokens"
        KeyDisableTypoToleranceOnAttributes shouldEqual "disableTypoToleranceOnAttributes"
        KeyDisableTypoToleranceOnWords shouldEqual "disableTypoToleranceOnWords"
        KeySeparatorsToIndex shouldEqual "separatorsToIndex"
        KeyAroundLatLng shouldEqual "aroundLatLng"
        KeyAroundLatLngViaIP shouldEqual "aroundLatLngViaIP"
        KeyAroundRadius shouldEqual "aroundRadius"
        KeyAroundPrecision shouldEqual "aroundPrecision"
        KeyMinimumAroundRadius shouldEqual "minimumAroundRadius"
        KeyInsideBoundingBox shouldEqual "insideBoundingBox"
        KeyInsidePolygon shouldEqual "insidePolygon"
        KeyIgnorePlurals shouldEqual "ignorePlurals"
        KeyRemoveStopWords shouldEqual "removeStopWords"
        KeyCamelCaseAttributes shouldEqual "camelCaseAttributes"
        KeyDecompoundedAttributes shouldEqual "decompoundedAttributes"
        KeyKeepDiacriticsOnCharacters shouldEqual "keepDiacriticsOnCharacters"
        KeyQueryLanguages shouldEqual "queryLanguages"
        KeyEnableRules shouldEqual "enableRules"
        KeyRuleContexts shouldEqual "ruleContexts"
        KeyEnablePersonalization shouldEqual "enablePersonalization"
        KeyQueryType shouldEqual "queryType"
        KeyRemoveWordsIfNoResults shouldEqual "removeWordsIfNoResults"
        KeyAdvancedSyntax shouldEqual "advancedSyntax"
        KeyOptionalWords shouldEqual "optionalWords"
        KeyDisablePrefixOnAttributes shouldEqual "disablePrefixOnAttributes"
        KeyDisableExactOnAttributes shouldEqual "disableExactOnAttributes"
        KeyExactOnSingleWordQuery shouldEqual "exactOnSingleWordQuery"
        KeyAlternativesAsExact shouldEqual "alternativesAsExact"
        KeyNumericAttributesForFiltering shouldEqual "numericAttributesForFiltering"
        KeyAllowCompressionOfIntegerArray shouldEqual "allowCompressionOfIntegerArray"
        KeyAttributeForDistinct shouldEqual "attributeForDistinct"
        KeyDistinct shouldEqual "distinct"
        KeyGetRankingInfo shouldEqual "getRankingInfo"
        KeyClickAnalytics shouldEqual "clickAnalytics"
        KeyAnalytics shouldEqual "analytics"
        KeyAnalyticsTags shouldEqual "analyticsTags"
        KeySynonyms shouldEqual "synonyms"
        KeyReplaceSynonymsInHighlight shouldEqual "replaceSynonymsInHighlight"
        KeyMinProximity shouldEqual "minProximity"
        KeyResponseFields shouldEqual "responseFields"
        KeyMaxFacetHits shouldEqual "maxFacetHits"
        KeyPercentileComputation shouldEqual "percentileComputation"
        KeyGeo shouldEqual "geo"
        KeyTypo shouldEqual "typo"
        KeyWords shouldEqual "words"
        KeyProximity shouldEqual "proximity"
        KeyAttribute shouldEqual "attribute"
        KeyExact shouldEqual "exact"
        KeyCustom shouldEqual "custom"
        KeyAsc shouldEqual "asc"
        KeyDesc shouldEqual "desc"
        KeyStrict shouldEqual "strict"
        KeyMin shouldEqual "min"
        KeySingleWordSynonym shouldEqual "singleWordSynonym"
        KeyMultiWordsSynonym shouldEqual "multiWordsSynonym"
        KeyAll shouldEqual "all"
        KeyWord shouldEqual "word"
        KeyNone shouldEqual "none"
        KeyStopIfEnoughMatches shouldEqual "stopIfEnoughMatches"
        KeyPrefixLast shouldEqual "prefixLast"
        KeyPrefixAll shouldEqual "prefixAll"
        KeyPrefixNone shouldEqual "prefixNone"
        KeyLastWords shouldEqual "lastWords"
        KeyFirstWords shouldEqual "firstWords"
        KeyAllOptional shouldEqual "allOptional"
        KeyStar shouldEqual "*"
        KeyAutomaticRadius shouldEqual "automaticRadius"
        KeyExhaustiveFacetsCount shouldEqual "exhaustiveFacetsCount"
        KeyFacets_Stats shouldEqual "facets_stats"
        KeyHits shouldEqual "hits"
        KeyIndex shouldEqual "index"
        KeyNbHits shouldEqual "nbHits"
        KeyNbPages shouldEqual "nbPages"
        KeyParams shouldEqual "params"
        KeyProcessingTimeMS shouldEqual "processingTimeMS"
        KeyQueryAfterRemoval shouldEqual "queryAfterRemoval"
        KeyUserData shouldEqual "userData"
        KeyCount shouldEqual "count"
        KeyAlpha shouldEqual "alpha"
        KeyEqualOnly shouldEqual "equalOnly"
        KeyFacetQuery shouldEqual "facetQuery"
        KeyStrategy shouldEqual "strategy"
        KeyRequests shouldEqual "requests"
        KeyIndexName shouldEqual "indexName"
        KeyPublished shouldEqual "published"
        KeyNotPublished shouldEqual "notPublished"
        KeyStatus shouldEqual "status"
        KeyOperation shouldEqual "operation"
        KeyDestination shouldEqual "destination"
        KeyCopy shouldEqual "copy"
        KeyMove shouldEqual "move"
        KeyRules shouldEqual "rules"
        KeySettings shouldEqual "settings"
        KeyScope shouldEqual "scope"
        KeyCursor shouldEqual "cursor"
        KeyPartial shouldEqual "partial"
        KeyFull shouldEqual "full"
        KeyCreateIfNotExists shouldEqual "createIfNotExists"
        KeyIncrement shouldEqual "Increment"
        KeyDecrement shouldEqual "Decrement"
        KeyAdd shouldEqual "Add"
        KeyRemove shouldEqual "Remove"
        KeyRemoveLowercase shouldEqual "remove"
        KeyAddUnique shouldEqual "AddUnique"
        Key_Operation shouldEqual "_operation"
        KeyValue shouldEqual "value"
        KeyObjectID shouldEqual "objectID"
        KeyResults shouldEqual "results"
        KeyAddObject shouldEqual "addObject"
        KeyUpdateObject shouldEqual "updateObject"
        KeyPartialUpdateObject shouldEqual "partialUpdateObject"
        KeyPartialUpdateObjectNoCreate shouldEqual "partialUpdateObjectNoCreate"
        KeyDeleteObject shouldEqual "deleteObject"
        KeyDelete shouldEqual "delete"
        KeyClear shouldEqual "clear"
        KeyAction shouldEqual "action"
        KeyBody shouldEqual "body"
        KeyObjectIDs shouldEqual "objectIDs"
        KeyTaskID shouldEqual "taskID"
        KeySearch shouldEqual "search"
        KeyBrowse shouldEqual "browse"
        KeyDeleteIndex shouldEqual "deleteIndex"
        KeyEditSettings shouldEqual "editSettings"
        KeyListIndexes shouldEqual "listIndexes"
        KeyLogs shouldEqual "logs"
        KeySeeUnretrievableAttributes shouldEqual "seeUnretrievableAttributes"
        KeyType shouldEqual "type"
        KeySynonym shouldEqual "synonym"
        KeyOneWaySynonym shouldEqual "onewaysynonym"
        KeyInput shouldEqual "input"
        KeyCorrections shouldEqual "corrections"
        KeyReplacements shouldEqual "replacements"
        KeyPlaceholder shouldEqual "placeholder"
        KeyAlternativeCorrection1 shouldEqual "altcorrection1"
        KeyAlternativeCorrection2 shouldEqual "altcorrection2"
        KeyReplaceExistingSynonyms shouldEqual "replaceExistingSynonyms"
        KeyIs shouldEqual "is"
        KeyStartsWith shouldEqual "startsWith"
        KeyEndsWith shouldEqual "endsWith"
        KeyContains shouldEqual "contains"
        KeyContext shouldEqual "context"
        KeyRule shouldEqual "rule"
        KeyAnchoring shouldEqual "anchoring"
        KeyPattern shouldEqual "pattern"
        KeyReplace shouldEqual "replace"
        KeyFacet shouldEqual "facet"
        KeyDisjunctive shouldEqual "disjunctive"
        KeyScore shouldEqual "score"
        KeyInsert shouldEqual "insert"
        KeyEdits shouldEqual "edits"
        KeyAutomaticFacetFilters shouldEqual "automaticFacetFilters"
        KeyAutomaticOptionalFacetFilters shouldEqual "automaticOptionalFacetFilters"
        KeyPromote shouldEqual "promote"
        KeyHide shouldEqual "hide"
        KeyClearExistingRules shouldEqual "clearExistingRules"
        KeyCluster shouldEqual "cluster"
        KeyAlgoliaUserID shouldEqual "X-Algolia-User-ID"
        KeyForwardedFor shouldEqual "X-Forwarded-For"
        KeyDeletedAt shouldEqual "deletedAt"
        KeyCreatedAt shouldEqual "createdAt"
        KeyUpdatedAt shouldEqual "updatedAt"
        KeyKey shouldEqual "key"
        KeyUserIDs shouldEqual "userIDs"
        KeyTopUsers shouldEqual "topUsers"
        KeyKeys shouldEqual "keys"
        Key_HighlightResult shouldEqual "_highlightResult"
        Key_SnippetResult shouldEqual "_snippetResult"
        Key_RankingInfo shouldEqual "_rankingInfo"
        KeyPromoted shouldEqual "promoted"
        KeyNbTypos shouldEqual "nbTypos"
        KeyFirstMatchedWord shouldEqual "firstMatchedWord"
        KeyProximityDistance shouldEqual "proximityDistance"
        KeyUserScore shouldEqual "userScore"
        KeyGeoDistance shouldEqual "geoDistance"
        KeyGeoPrecision shouldEqual "geoPrecision"
        KeyNbExactWords shouldEqual "nbExactWords"
        KeyMatchedGeoLocation shouldEqual "matchedGeoLocation"
        KeyLat shouldEqual "lat"
        KeyLng shouldEqual "lng"
        KeyDistance shouldEqual "distance"
        Key_DistinctSeqID shouldEqual "_distinctSeqID"
        KeyExhaustiveNbHits shouldEqual "exhaustiveNbHits"
        KeyMessage shouldEqual "message"
        KeyServerUsed shouldEqual "serverUsed"
        KeyIndexUsed shouldEqual "indexUsed"
        KeyAbTestVariantID shouldEqual "abTestVariantID"
        KeyParsedQuery shouldEqual "parsedQuery"
        KeyProcessed shouldEqual "processed"
        KeyMatchLevel shouldEqual "matchLevel"
        KeyFullyHighlighted shouldEqual "fullyHighlighted"
        KeyMatchedWords shouldEqual "matchedWords"
        KeyMax shouldEqual "max"
        KeyAvg shouldEqual "avg"
        KeySum shouldEqual "sum"
        KeyName shouldEqual "name"
        KeyAcl shouldEqual "acl"
        KeyIndexes shouldEqual "indexes"
        KeyDescription shouldEqual "description"
        KeyMaxHitsPerQuery shouldEqual "maxHitsPerQuery"
        KeyMaxQueriesPerIPPerHour shouldEqual "maxQueriesPerIPPerHour"
        KeyValidity shouldEqual "validity"
        KeyQueryParameters shouldEqual "queryParameters"
        KeyReferers shouldEqual "referers"
        KeyClusterName shouldEqual "clusterName"
        KeyUserID shouldEqual "userID"
        KeyNbRecords shouldEqual "nbRecords"
        KeyDataSize shouldEqual "dataSize"
        KeyNbUserIDs shouldEqual "nbUserIDs"
        KeyClusters shouldEqual "clusters"
        KeyItems shouldEqual "items"
        KeyEntries shouldEqual "entries"
        KeyFileSize shouldEqual "fileSize"
        KeyLastBuildTimeS shouldEqual "lastBuildTimeS"
        KeyNumberOfPendingTasks shouldEqual "numberOfPendingTasks"
        KeyPendingTask shouldEqual "pendingTask"
        KeyCondition shouldEqual "condition"
        KeyConsequence shouldEqual "consequence"
        KeyEnabled shouldEqual "enabled"
        KeyFacetHits shouldEqual "facetHits"
        KeyId shouldEqual "id"
        KeyHighlighted shouldEqual "highlighted"
        KeyAlgoliaApplicationID shouldEqual "X-Algolia-Application-Id"
        KeyAlgoliaAPIKey shouldEqual "X-Algolia-API-Key"
        KeyPrimary shouldEqual "primary"
        KeySourceABTest shouldEqual "sourceABTest"
        KeyABTest shouldEqual "abTest"
        KeyOrdered shouldEqual "ordered"
        KeyUnordered shouldEqual "unordered"
        KeyFilterOnly shouldEqual "filterOnly"
        KeySearchable shouldEqual "searchable"
        KeyQueryID shouldEqual "queryID"
        KeyVersion shouldEqual "version"
        KeyPosition shouldEqual "position"
        KeyFrom shouldEqual "from"
        KeyUntil shouldEqual "until"
        KeyAttributesToIndex shouldEqual "attributesToIndex"
        KeyNumericAttributesToIndex shouldEqual "numericAttributesToIndex"
        KeySlaves shouldEqual "slaves"
        KeyRestrictSources shouldEqual "restrictSources"
        KeyTimestamp shouldEqual "timestamp"
        KeyMethod shouldEqual "method"
        KeyAnswer_Code shouldEqual "answer_code"
        KeyQuery_Body shouldEqual "query_body"
        KeyAnswer shouldEqual "answer"
        KeyUrl shouldEqual "url"
        KeyIp shouldEqual "ip"
        KeyQuery_Headers shouldEqual "query_headers"
        KeySha1 shouldEqual "sha1"
        KeyProcessing_Time_Ms shouldEqual "processing_time_ms"
        KeyNb_Api_Calls shouldEqual "nb_api_calls"
        KeyQuery_Params shouldEqual "query_params"
        KeyQuery_Nb_Hits shouldEqual "query_nb_hits"
        KeyEndAt shouldEqual "endAt"
        KeyTrafficPercentage shouldEqual "trafficPercentage"
        KeyVariants shouldEqual "variants"
        KeyABTestID shouldEqual "abTestID"
        KeyTrackedSearchCount shouldEqual "trackedSearchCount"
        KeyABTests shouldEqual "abtests"
        KeyLimit shouldEqual "limit"
        KeyTotal shouldEqual "total"
        KeyCustomSearchParameters shouldEqual "customSearchParameters"
        KeyActive shouldEqual "active"
        KeyStopped shouldEqual "stopped"
        KeyExpired shouldEqual "expired"
        KeyFailed shouldEqual "failed"
        KeyPercentage shouldEqual "percentage"
        KeyEventName shouldEqual "eventName"
        KeyUserToken shouldEqual "userToken"
        KeyPositions shouldEqual "positions"
        KeyEventType shouldEqual "eventType"
        KeyClick shouldEqual "click"
        KeyView shouldEqual "view"
        KeyConversion shouldEqual "conversion"
        KeyEvents shouldEqual "events"
        KeyDisjunctiveFacets shouldEqual "disjunctiveFacets"
        KeyEventsScoring shouldEqual "eventsScoring"
        KeyFacetsScoring shouldEqual "facetsScoring"
        Key_Exhaustive_Faceting shouldEqual "exhaustive_faceting"
        KeyExactPhrase shouldEqual "exactPhrase"
        KeyExcludeWords shouldEqual "excludeWords"
        KeyAdvancedSyntaxFeatures shouldEqual "advancedSyntaxFeatures"
        KeyPersonalizationImpact shouldEqual "personalizationImpact"
        KeyLanguage shouldEqual "language"
        KeyCity shouldEqual "city"
        KeyCountry shouldEqual "country"
        KeyAddress shouldEqual "address"
        KeyBusStop shouldEqual "busStop"
        KeyTrainStation shouldEqual "trainStation"
        KeyTownhall shouldEqual "townhall"
        KeyAirport shouldEqual "airport"
        KeyLocaleNames shouldEqual "locale_names"
        KeyCounty shouldEqual "county"
        KeyAdministrative shouldEqual "administrative"
        KeyCountryCode shouldEqual "country_code"
        KeyPostCode shouldEqual "postcode"
        KeyPopulation shouldEqual "population"
        Key_Geoloc shouldEqual "_geoloc"
        KeyIs_Country shouldEqual "is_country"
        KeyIs_City shouldEqual "is_city"
        KeyIs_Popular shouldEqual "is_popular"
        KeyIs_Highway shouldEqual "is_highway"
        KeyIs_Suburb shouldEqual "is_suburb"
        KeyImportance shouldEqual "importance"
        Key_Tags shouldEqual "_tags"
        KeyAdmin_Level shouldEqual "admin_level"
        KeyDistrict shouldEqual "district"
        KeyDegradedQuery shouldEqual "degradedQuery"
        KeyGeoPoint shouldEqual "geoPoint"
        KeyVillage shouldEqual "village"
        KeySimilarQuery shouldEqual "similarQuery"
        KeyEnableABTest shouldEqual "enableABTest"
        KeyAlternatives shouldEqual "alternatives"
        KeyIndexLanguages shouldEqual "indexLanguages"
        KeyCustomNormalization shouldEqual "customNormalization"
        KeyFilterPromotes shouldEqual "filterPromotes"
        KeyUsers shouldEqual "users"
        KeyExplain shouldEqual "explain"
        KeyOriginal shouldEqual "original"
        KeyExcluded shouldEqual "excluded"
        KeyOptional shouldEqual "optional"
        KeyStopWord shouldEqual "stopword"
        KeySplit shouldEqual "split"
        KeyConcat shouldEqual "concat"
        KeyAltcorrection shouldEqual "altcorrection"
        KeyPlural shouldEqual "plural"
        KeyCompound shouldEqual "compound"
        KeyMatch shouldEqual "match"
        KeyTypos shouldEqual "typos"
        KeyMatchAlternatives shouldEqual "match.alternatives"
        KeyTypes shouldEqual "types"
        KeyPending shouldEqual "pending"
        KeyGetClusters shouldEqual "getClusters"
    }
}