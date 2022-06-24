package com.example.data.api

import com.example.data.datamodel.ListingApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ListingApi {

    @GET("dynamodb-writer")
    suspend fun getListings(): Response<ListingApiResponse>

}