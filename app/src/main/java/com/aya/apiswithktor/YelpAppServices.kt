package com.aya.apiswithktor

interface YelpAppServices {

    suspend fun search(
        term:String = "burger",
        location : String = "california",
        limit : Int = 50
    ):SearchResponse
}