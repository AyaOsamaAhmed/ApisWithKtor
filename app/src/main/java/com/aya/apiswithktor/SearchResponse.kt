package com.aya.apiswithktor

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchResponse (
    @SerialName("businesses")
    val businesses: List<BusinessResponse>,

    @SerialName("total")
    val total: Int
    ){

    @Serializable
    data class BusinessResponse(
        @SerialName("id")
        val id: String,

        @SerialName("name")
        val name: String,

        @SerialName("image_url")
        val imageUrl: String,

        @SerialName("is_closed")
        val isClosed: Boolean,

        @SerialName("categories")
        val categories: List<BusinessCategoryResponse>,

        @SerialName("price")
        val price: String?,

        @SerialName("rating")
        val rating: Float,

        @SerialName("phone")
        val phone: String,
    )

    @Serializable
    data class BusinessCategoryResponse(
        @SerialName("title")
        val title: String,
    )

}