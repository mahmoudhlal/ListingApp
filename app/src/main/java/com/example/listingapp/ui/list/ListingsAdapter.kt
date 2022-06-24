package com.example.listingapp.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.entities.ListingModel
import com.example.listingapp.databinding.ViewListingBinding

class ListingsAdapter(
    private val list: List<ListingModel>,
    private val onItemClick: (ListingModel) -> Unit
) : RecyclerView.Adapter<ListingsAdapter.ListingViewHolder>() {

    inner class ListingViewHolder(private val binding: ViewListingBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(listing: ListingModel) {
            binding.item = listing
            binding.root.setOnClickListener { onItemClick(listing) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListingViewHolder {
        val itemBinding: ViewListingBinding =
            ViewListingBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListingViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ListingViewHolder, position: Int) {
        holder.bind(listing = list[position])
    }

    override fun getItemCount() = list.size
}
