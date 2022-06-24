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
        viewModelObserver()
        onClick()
    }

    private fun onClick() {
        binding.btnRetry.setOnClickListener {
            getListings()
        }
    }

    private fun viewModelObserver(){
        viewModel.listings.observe(viewLifecycleOwner){
            when(it){
                is Result.Success -> renderData(it.data)
                is Result.Error -> showError(it.msg)
                is Result.Loading -> showLoading()
            }
        }
    }

    private fun getListings(){
        viewModel.getListings()
    }

    private fun renderData(listings: List<ListingModel>){
        hideLoading()
        hideError()
        if (listings.isEmpty()) {
            showError("Sorry no listings founded")
            return
        }
        val adapter = ListingsAdapter(listings){}
        binding.listingsRec.adapter = adapter
        showDataFrame()
    }

    private fun showDataFrame(){
        binding.dataFrame.show()
    }

    private fun showLoading(){
        binding.progress.show()
    }

    private fun hideLoading(){
        binding.progress.hide()
    }

    private fun showError(errorMsg: String){
        hideLoading()
        binding.errorSubTitle.text = errorMsg
        binding.errorFrame.show()
    }

    private fun hideError(){
        binding.errorFrame.hide()
    }

}