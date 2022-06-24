package com.example.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListingModel (
    val created_at: String,
    val image_urls: List<String>,
    val image_urls_thumbnails: List<String>,
    val name: String,
    val price: String,
) : Parcelable