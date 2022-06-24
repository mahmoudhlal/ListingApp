package com.example.listingapp.ui.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.domain.common.Result
import com.example.domain.entities.ListingModel
import com.example.listingapp.R
import com.example.listingapp.databinding.FragmentListingsBinding
import com.example.listingapp.utils.hide
import com.example.listingapp.utils.show
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListingsFragment : Fragment() {


    private val viewModel : ListingsViewModel by viewModels()
    private lateinit var binding: FragmentListingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getListings()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_listings, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    private fun viewModelObserver(){
        viewModel.listings.observe(viewLifecycleOwner){
            when(it){
                is Result.Success -> {}
                is Result.Error -> {}
                is Result.Loading -> {}
            }
        }
    }

    private fun getListings(){
        viewModel.getListings()
    }

    private fun renderData(listings: List<ListingModel>){

    }

    private fun showLoading(){
        binding.progress.show()
    }

    private fun hideLoading(){
        binding.progress.hide()
    }

    private fun showError(){
        binding.errorFrame.show()
    }

    private fun hideError(){
        binding.errorFrame.hide()
    }

}