package com.example.data.repositories

import com.example.data.api.ListingApi
import com.example.data.mapper.ListingModelMapper
import com.example.domain.common.Result
import com.example.domain.entities.ListingModel
import com.example.domain.repositories.ListingsRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class ListingsRepositoryImpl(
    private val service: ListingApi,
    private val dispatcher: CoroutineDispatcher,
    private val mapper: ListingModelMapper
) : ListingsRepository {
    override suspend fun getListings() = withContext(dispatcher) {
        try {
            val response = service.getListings()
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null)
                    return@withContext Result.Success(mapper.toListings(body.results))
                else
                    return@withContext Result.Error("The returned data was null")
            } else {
                return@withContext Result.Error(response.message())
            }
        } catch (e: Exception) {
            return@withContext Result.Error(e.message ?: "Nothing")
        }
    }
}