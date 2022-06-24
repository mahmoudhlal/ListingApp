package com.example.listingapp.ui.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.domain.entities.ListingModel
import com.example.listingapp.R
import com.example.listingapp.databinding.FragmentListingDetailsBinding
import com.example.listingapp.databinding.FragmentListingsBinding

const val LISTING_MODEL = "model"

class ListingDetailsFragment : Fragment() {

    private lateinit var binding: FragmentListingDetailsBinding
    private var listingModel: ListingModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            listingModel = it.getParcelable(LISTING_MODEL)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_listing_details, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.item = listingModel
        onClick()
    }

    private fun onClick(){
        binding.btnClose.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}