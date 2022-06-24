package com.example.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListingModel (
    val created_at: String,
    val image_url: String,
    val image_url_thumbnail: String,
    val name: String,
    val price: String,
) : Parcelable