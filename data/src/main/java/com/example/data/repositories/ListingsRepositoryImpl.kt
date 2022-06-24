package com.example.data.repositories

import com.example.domain.common.Result
import com.example.domain.entities.ListingModel
import com.example.domain.repositories.ListingsRepository

class ListingsRepositoryImpl: ListingsRepository {
    override suspend fun getListings(): Result<List<ListingModel>> {
        TODO("Not yet implemented")
    }
}