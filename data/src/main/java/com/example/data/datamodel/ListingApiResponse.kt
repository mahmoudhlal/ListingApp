package com.example.data.datamodel

data class ListingApiResponse(
    val pagination: Pagination,
    val results: List<Listing>
)


data class Listing(
    val created_at: String,
    val image_ids: List<String>,
    val image_urls: List<String>,
    val image_urls_thumbnails: List<String>,
    val name: String,
    val price: String,
    val uid: String
)

data class Pagination(
    val key: Any
)