package com.algolia.search.serialize


internal const val KeyQuery = "query"
internal const val KeySearchableAttributes = "searchableAttributes"
internal const val KeyAttributesForFaceting = "attributesForFaceting"
internal const val KeyUnretrievableAttributes = "unretrievableAttributes"
internal const val KeyAttributesToRetrieve = "attributesToRetrieve"
internal const val KeyRestrictSearchableAttributes = "restrictSearchableAttributes"
internal const val KeyRanking = "ranking"
internal const val KeyCustomRanking = "customRanking"
internal const val KeyReplicas = "replicas"
internal const val KeyFilters = "filters"
internal const val KeyFacetFilters = "facetFilters"
internal const val KeyOptionalFilters = "optionalFilters"
internal const val KeyNumericFilters = "numericFilters"
internal const val KeyTagFilters = "tagFilters"
internal const val KeySumOrFiltersScores = "sumOrFiltersScores"
internal const val KeyFacets = "facets"
internal const val KeyMaxValuesPerFacet = "maxValuesPerFacet"
internal const val KeyFacetingAfterDistinct = "facetingAfterDistinct"
internal const val KeySortFacetValuesBy = "sortFacetValuesBy"
internal const val KeyAttributesToHighlight = "attributesToHighlight"
internal const val KeyAttributesToSnippet = "attributesToSnippet"
internal const val KeyHighlightPreTag = "highlightPreTag"
internal const val KeyHighlightPostTag = "highlightPostTag"
internal const val KeySnippetEllipsisText = "snippetEllipsisText"
internal const val KeyRestrictHighlightAndSnippetArrays = "restrictHighlightAndSnippetArrays"
internal const val KeyPage = "page"
internal const val KeyHitsPerPage = "hitsPerPage"
internal const val KeyOffset = "offset"
internal const val KeyLength = "length"
internal const val KeyPaginationLimitedTo = "paginationLimitedTo"
internal const val KeyMinWordSizefor1Typo = "minWordSizefor1Typo"
internal const val KeyMinWordSizefor2Typos = "minWordSizefor2Typos"
internal const val KeyTypoTolerance = "typoTolerance"
internal const val KeyAllowTyposOnNumericTokens = "allowTyposOnNumericTokens"
internal const val KeyDisableTypoToleranceOnAttributes = "disableTypoToleranceOnAttributes"
internal const val KeyDisableTypoToleranceOnWords = "disableTypoToleranceOnWords"
internal const val KeySeparatorsToIndex = "separatorsToIndex"
internal const val KeyAroundLatLng = "aroundLatLng"
internal const val KeyAroundLatLngViaIP = "aroundLatLngViaIP"
internal const val KeyAroundRadius = "aroundRadius"
internal const val KeyAroundPrecision = "aroundPrecision"
internal const val KeyMinimumAroundRadius = "minimumAroundRadius"
internal const val KeyInsideBoundingBox = "insideBoundingBox"
internal const val KeyInsidePolygon = "insidePolygon"
internal const val KeyIgnorePlurals = "ignorePlurals"
internal const val KeyRemoveStopWords = "removeStopWords"
internal const val KeyCamelCaseAttributes = "camelCaseAttributes"
internal const val KeyDecompoundedAttributes = "decompoundedAttributes"
internal const val KeyKeepDiacriticsOnCharacters = "keepDiacriticsOnCharacters"
internal const val KeyQueryLanguages = "queryLanguages"
internal const val KeyEnableRules = "enableRules"
internal const val KeyRuleContexts = "ruleContexts"
internal const val KeyEnablePersonalization = "enablePersonalization"
internal const val KeyQueryType = "queryType"
internal const val KeyRemoveWordsIfNoResults = "removeWordsIfNoResults"
internal const val KeyAdvancedSyntax = "advancedSyntax"
internal const val KeyOptionalWords = "optionalWords"
internal const val KeyDisablePrefixOnAttributes = "disablePrefixOnAttributes"
internal const val KeyDisableExactOnAttributes = "disableExactOnAttributes"
internal const val KeyExactOnSingleWordQuery = "exactOnSingleWordQuery"
internal const val KeyAlternativesAsExact = "alternativesAsExact"
internal const val KeyNumericAttributesForFiltering = "numericAttributesForFiltering"
internal const val KeyAllowCompressionOfIntegerArray = "allowCompressionOfIntegerArray"
internal const val KeyAttributeForDistinct = "attributeForDistinct"
internal const val KeyDistinct = "distinct"
internal const val KeyGetRankingInfo = "getRankingInfo"
internal const val KeyClickAnalytics = "clickAnalytics"
internal const val KeyAnalytics = "analytics"
internal const val KeyAnalyticsTags = "analyticsTags"
internal const val KeySynonyms = "synonyms"
internal const val KeyReplaceSynonymsInHighlight = "replaceSynonymsInHighlight"
internal const val KeyMinProximity = "minProximity"
internal const val KeyResponseFields = "responseFields"
internal const val KeyMaxFacetHits = "maxFacetHits"
internal const val KeyPercentileComputation = "percentileComputation"
internal const val KeyGeo = "geo"
internal const val KeyTypo = "typo"
internal const val KeyWords = "words"
internal const val KeyProximity = "proximity"
internal const val KeyAttribute = "attribute"
internal const val KeyExact = "exact"
internal const val KeyCustom = "custom"
internal const val KeyAsc = "asc"
internal const val KeyDesc = "desc"
internal const val KeyStrict = "strict"
internal const val KeyMin = "min"
internal const val KeySingleWordSynonym = "singleWordSynonym"
internal const val KeyMultiWordsSynonym = "multiWordsSynonym"
internal const val KeyAll = "all"
internal const val KeyWord = "word"
internal const val KeyNone = "none"
internal const val KeyStopIfEnoughMatches = "stopIfEnoughMatches"
internal const val KeyPrefixLast = "prefixLast"
internal const val KeyPrefixAll = "prefixAll"
internal const val KeyPrefixNone = "prefixNone"
internal const val KeyLastWords = "lastWords"
internal const val KeyFirstWords = "firstWords"
internal const val KeyAllOptional = "allOptional"
internal const val KeyStar = "*"
internal const val KeyAutomaticRadius = "automaticRadius"
internal const val KeyExhaustiveFacetsCount = "exhaustiveFacetsCount"
internal const val KeyFacetsStats = "facets_stats"
internal const val KeyHits = "hits"
internal const val KeyIndex = "indexName"
internal const val KeyNbHits = "nbHits"
internal const val KeyNbPages = "nbPages"
internal const val KeyParams = "params"
internal const val KeyProcessingTimeMS = "processingTimeMS"
internal const val KeyQueryAfterRemoval = "queryAfterRemoval"
internal const val KeyUserData = "userData"
internal const val KeyCount = "count"
internal const val KeyAlpha = "alpha"
internal const val KeyEqualOnly = "equalOnly"
internal const val KeyFacetQuery = "facetQuery"
internal const val KeyStrategy = "strategy"
internal const val KeyRequests = "requests"
internal const val KeyIndexName = "indexName"
internal const val KeyForwardToReplicas = "forwardToReplicas"
internal const val KeyPublished = "published"
internal const val KeyNotPublished = "notPublished"
internal const val KeyStatus = "status"
internal const val KeyOperation = "operation"
internal const val KeyDestination = "destination"
internal const val KeyCopy = "copy"
internal const val KeyMove = "move"
internal const val KeyRules = "rules"
internal const val KeySettings = "settings"
internal const val KeyScope = "scope"
internal const val KeyCursor = "cursor"
internal const val KeyPartial = "partial"
internal const val KeyFull = "full"
internal const val KeyCreateIfNotExists = "createIfNotExists"
internal const val KeyIncrement = "Increment"
internal const val KeyDecrement = "Decrement"
internal const val KeyAdd = "Add"
internal const val KeyRemove = "Remove"
internal const val KeyAddUnique = "AddUnique"
internal const val Key_Operation = "_operation"
internal const val KeyValue = "value"
internal const val KeyObjectID = "objectID"
internal const val KeyResults = "results"
internal const val KeyAddObject = "addObject"
internal const val KeyUpdateObject = "updateObject"
internal const val KeyPartialUpdateObject = "partialUpdateObject"
internal const val KeyPartialUpdateObjectNoCreate = "partialUpdateObjectNoCreate"
internal const val KeyDeleteObject = "deleteObject"
internal const val KeyDelete = "delete"
internal const val KeyClear = "clear"
internal const val KeyAction = "action"
internal const val KeyBody = "body"
internal const val KeyObjectIDs = "objectIDs"
internal const val KeyTaskID = "taskID"
internal const val KeySearch = "search"
internal const val KeyBrowse = "browse"
internal const val KeyDeleteIndex = "deleteIndex"
internal const val KeyEditSettings = "editSettings"
internal const val KeyListIndexes = "listIndexes"
internal const val KeyLogs = "logs"
internal const val KeySeeUnretrievableAttributes = "seeUnretrievableAttributes"
internal const val KeyType = "type"
internal const val KeySynonym = "synonym"
internal const val KeyOneWaySynonym = "onewaysynonym"
internal const val KeyInput = "input"
internal const val KeyCorrections = "corrections"
internal const val KeyReplacements = "replacements"
internal const val KeyPlaceholder = "placeholder"
internal const val KeyAlternativeCorrection1 = "altcorrection1"
internal const val KeyAlternativeCorrection2 = "altcorrection2"
internal const val KeyReplaceExistingSynonyms = "replaceExistingSynonyms"
internal const val KeyIs = "is"
internal const val KeyStartsWith = "startsWith"
internal const val KeyEndsWith = "endsWith"
internal const val KeyContains = "contains"
internal const val KeyContext = "context"
internal const val KeyRule = "rule"
internal const val KeyAnchoring = "anchoring"
internal const val KeyPattern = "pattern"
internal const val KeyReplace = "replace"
internal const val KeyFacet = "facet"
internal const val KeyDisjunctive = "disjunctive"
internal const val KeyScore = "score"
internal const val KeyInsert = "insert"
internal const val KeyEdits = "edits"
internal const val KeyAutomaticFacetFilters = "automaticFacetFilters"
internal const val KeyAutomaticOptionalFacetFilters = "automaticOptionalFacetFilters"
internal const val KeyPromote = "promote"
internal const val KeyHide = "hide"
internal const val KeyClearExistingRules = "clearExistingRules"
internal const val KeyCluster = "cluster"
internal const val KeyAlgoliaUserID = "X-Algolia-User-ID"
internal const val KeyForwardedFor = "X-Forwarded-For"
internal const val KeyDeletedAt = "deletedAt"
internal const val KeyCreatedAt = "createdAt"
internal const val KeyUpdatedAt = "updatedAt"
internal const val KeyKey = "key"
internal const val KeyUserIDs = "userIDs"
internal const val KeyTopUsers = "topUsers"
internal const val KeyKeys = "keys"
internal const val KeyHighlightResult = "_highlightResult"
internal const val KeySnippetResult = "_snippetResult"
internal const val KeyRankingInfo = "_rankingInfo"
internal const val KeyPromoted = "promoted"
internal const val KeyNbTypos = "nbTypos"
internal const val KeyFirstMatchedWord = "firstMatchedWord"
internal const val KeyProximityDistance = "proximityDistance"
internal const val KeyUserScore = "userScore"
internal const val KeyGeoDistance = "geoDistance"
internal const val KeyGeoPrecision = "geoPrecision"
internal const val KeyNbExactWords = "nbExactWords"
internal const val KeyMatchedGeoLocation = "matchedGeoLocation"
internal const val KeyLat = "lat"
internal const val KeyLng = "lng"
internal const val KeyDistance = "distance"
internal const val KeyDistinctSeqID = "_distinctSeqID"
internal const val KeyExhaustiveNbHits = "exhaustiveNbHits"
internal const val KeyMessage = "message"
internal const val KeyServerUsed = "serverUsed"
internal const val KeyIndexUsed = "indexUsed"
internal const val KeyAbTestVariantID = "abTestVariantID"
internal const val KeyParsedQuery = "parsedQuery"
internal const val KeyProcessed = "processed"
internal const val KeyMatchLevel = "matchLevel"
internal const val KeyFullyHighlighted = "fullyHighlighted"
internal const val KeyMatchedWords = "matchedWords"
internal const val KeyMax = "max"
internal const val KeyAvg = "avg"
internal const val KeySum = "sum"
internal const val KeyName = "name"
internal const val KeyAcl = "acl"
internal const val KeyIndexes = "indexes"
internal const val KeyDescription = "description"
internal const val KeyMaxHitsPerQuery = "maxHitsPerQuery"
internal const val KeyMaxQueriesPerIpPerHour = "maxQueriesPerIpPerHour"
internal const val KeyValidity = "validity"
internal const val KeyQueryParameters = "queryParameters"
internal const val KeyReferers = "referers"
internal const val KeyClusterName = "clusterName"
internal const val KeyUserID = "userID"
internal const val KeyNbRecords = "nbRecords"
internal const val KeyDataSize = "dataSize"
internal const val KeyNbUserIDs = "nbUserIDs"
internal const val KeyClusters = "clusters"

internal const val KeyAfrikaans = "af"
internal const val KeyArabic = "ar"
internal const val KeyAzeri = "az"
internal const val KeyBulgarian = "bg"
internal const val KeyBrunei = "bn"
internal const val KeyCatalan = "ca"
internal const val KeyCzech = "cs"
internal const val KeyWelsh = "cy"
internal const val KeyDanish = "da"
internal const val KeyGerman = "de"
internal const val KeyEnglish = "en"
internal const val KeyEsperanto = "eo"
internal const val KeySpanish = "es"
internal const val KeyEstonian = "et"
internal const val KeyBasque = "eu"
internal const val KeyFinnish = "fi"
internal const val KeyFaroese = "fo"
internal const val KeyFrench = "fr"
internal const val KeyGalician = "gl"
internal const val KeyHebrew = "he"
internal const val KeyHindi = "hi"
internal const val KeyHungarian = "hu"
internal const val KeyArmenian = "hy"
internal const val KeyIndonesian = "id"
internal const val KeyIcelandic = "is"
internal const val KeyItalian = "it"
internal const val KeyJapanese = "ja"
internal const val KeyGeorgian = "ka"
internal const val KeyKazakh = "kk"
internal const val KeyKorean = "ko"
internal const val KeyKyrgyz = "ky"
internal const val KeyLithuanian = "lt"
internal const val KeyMaori = "mi"
internal const val KeyMongolian = "mn"
internal const val KeyMarathi = "mr"
internal const val KeyMalay = "ms"
internal const val KeyMaltese = "mt"
internal const val KeyNorwegian = "nb"
internal const val KeyDutch = "nl"
internal const val KeyNorthernSotho = "ns"
internal const val KeyPolish = "pl"
internal const val KeyPashto = "ps"
internal const val KeyPortuguese = "pt"
internal const val KeyQuechua = "qu"
internal const val KeyRomanian = "ro"
internal const val KeyRussian = "ru"
internal const val KeySlovak = "sk"
internal const val KeyAlbanian = "sq"
internal const val KeySwedish = "sv"
internal const val KeySwahili = "sw"
internal const val KeyTamil = "ta"
internal const val KeyTelugu = "te"
internal const val KeyTagalog = "tl"
internal const val KeyTswana = "tn"
internal const val KeyTurkish = "tr"
internal const val KeyTatar = "tt"
