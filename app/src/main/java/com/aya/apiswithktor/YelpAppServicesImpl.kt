package com.aya.apiswithktor

import io.ktor.client.request.*

object YelpAppServicesImpl : YelpAppServices {

    private val httpClient by lazy {
        KtorClient.getInstance
    }


    override suspend fun search(term: String, location: String, limit: Int): SearchResponse {
        return httpClient.get {
            url("https://api.yelp.com/v3/businesses/search")
            parameter("term",term)
            parameter("location",location)
            parameter("limit",limit)
        }
    }
}