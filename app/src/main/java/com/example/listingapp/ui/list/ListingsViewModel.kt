package com.example.listingapp.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.common.Result
import com.example.domain.entities.ListingModel
import com.example.domain.usecases.GetListingsUseCase
import com.example.testapplication.utils.NetworkHelper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListingsViewModel @Inject constructor(
    private val useCase: GetListingsUseCase,
    private val networkHelper: NetworkHelper
) : ViewModel() {
    private val _listings = MutableLiveData<Result<List<ListingModel>>>()
    val listings: LiveData<Result<List<ListingModel>>>
        get() = _listings

    fun getListings(){
        if (networkHelper.isNetworkConnected()) {
            _listings.postValue(Result.Loading(""))
            viewModelScope.launch {
                val result = useCase.invoke()
                _listings.postValue(result)
            }
        }else{
            _listings.postValue(Result.Error("Network not connected"))
        }
    }


}