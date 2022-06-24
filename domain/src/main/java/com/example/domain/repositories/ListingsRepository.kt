package com.example.domain.repositories

import com.example.domain.common.Result
import com.example.domain.entities.ListingModel


interface ListingsRepository {
    suspend fun getListings() : Result<List<ListingModel>>
}