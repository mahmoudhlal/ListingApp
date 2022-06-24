package com.example.listingapp.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load
import com.example.listingapp.R

@BindingAdapter("src")
fun loadImage(img: ImageView, url: String?) {
    url?.let { img.load(it){
        crossfade(true)
        placeholder(R.drawable.ic_launcher_foreground)
        error(R.drawable.ic_launcher_background)
    }
    }
}