package com.example.domain.usecases

import com.example.domain.repositories.ListingsRepository

class GetListingsUseCase(private val repository: ListingsRepository) {
    suspend operator fun invoke() = repository.getListings()
}