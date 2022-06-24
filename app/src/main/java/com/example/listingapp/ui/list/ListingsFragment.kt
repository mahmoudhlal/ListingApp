package com.example.listingapp.ui.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.listingapp.R
import com.example.listingapp.databinding.FragmentListingsBinding


class ListingsFragment : Fragment() {

    private lateinit var binding: FragmentListingsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_listings, container, false)

        return binding.root
    }

}