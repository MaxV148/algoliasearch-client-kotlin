package com.algolia.search.endpoint

import com.algolia.search.model.ObjectID
import com.algolia.search.model.places.PlaceMulti
import com.algolia.search.model.places.PlacesQuery
import com.algolia.search.model.response.ResponseSearchPlacesMono
import com.algolia.search.model.response.ResponseSearchPlacesMulti
import com.algolia.search.model.search.Point
import com.algolia.search.model.search.QueryLanguage
import com.algolia.search.transport.RequestOptions


public interface EndpointPlaces {

    suspend fun searchPlaces(
        query: PlacesQuery = PlacesQuery(),
        requestOptions: RequestOptions? = null
    ): ResponseSearchPlacesMulti

    suspend fun searchPlaces(
        language: QueryLanguage,
        query: PlacesQuery = PlacesQuery(),
        requestOptions: RequestOptions? = null
    ): ResponseSearchPlacesMono

    suspend fun getByObjectID(
        objectID: ObjectID,
        requestOptions: RequestOptions? = null
    ): PlaceMulti

    suspend fun reverseGeocoding(
        geolocation: Point,
        hitsPerPage: Int? = null,
        requestOptions: RequestOptions? = null
    ): ResponseSearchPlacesMulti

    suspend fun reverseGeocoding(
        geolocation: Point,
        language: QueryLanguage,
        hitsPerPage: Int? = null,
        requestOptions: RequestOptions? = null
    ): ResponseSearchPlacesMono
}