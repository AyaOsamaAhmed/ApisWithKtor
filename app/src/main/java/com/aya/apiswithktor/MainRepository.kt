package com.aya.apiswithktor

import android.util.Log
import io.ktor.client.features.*
import java.io.IOException

object MainRepository {

    suspend fun search(term: String? = null):
            List<SearchResponse.BusinessResponse> {
        return try {
            val response =
                YelpAppServicesImpl.search(term = term ?: "")
            response.businesses
        } catch (e: ClientRequestException) {
            Log.d("MainRepository","client exception" )
            emptyList()
        } catch (e: IOException) {
            Log.d("MainRepository","no internet" )
            emptyList()
        }
    }
}