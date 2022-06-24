package com.example.listingapp.di

import com.example.data.api.ListingApi
import com.example.data.api.NetworkModule
import com.example.data.mapper.ListingModelMapper
import com.example.data.repositories.ListingsRepositoryImpl
import com.example.domain.repositories.ListingsRepository
import com.example.domain.usecases.GetListingsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {

    @Provides
    fun provideBaseUrl() = BuildConfig.BASE_URL


    @Provides
    @Singleton
    fun provideNetworkModule() = NetworkModule()


    @Provides
    @Singleton
    fun provideApiService(networkModule: NetworkModule, url: String) =
        networkModule.createPhotosApi(url)

    @Provides
    @Singleton
    fun provideListingModelMapper() = ListingModelMapper()

    @Provides
    @Singleton
    fun provideListingsRepository(repository: ListingsRepositoryImpl):ListingsRepository{
        return repository
    }

    @Provides
    @Singleton
    fun provideListingsRepositoryImpl(api: ListingApi, mapper: ListingModelMapper):ListingsRepositoryImpl{
        return ListingsRepositoryImpl(api, Dispatchers.IO, mapper)
    }

    @Provides
    @Singleton
    fun provideGetListingsUseCase(repository: ListingsRepository) = GetListingsUseCase(repository)

}