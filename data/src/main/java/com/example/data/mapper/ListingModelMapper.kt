package com.example.data.mapper

import com.example.data.datamodel.Listing
import com.example.data.utils.DateFormatCodes
import com.example.data.utils.toFormatDate
import com.example.domain.entities.ListingModel

class ListingModelMapper {

    fun toListings(listings: List<Listing>): List<ListingModel> {
        return listings.map {
            ListingModel(
                created_at = it.created_at.toFormatDate(dateAndTimePattern()),
                image_url = if (it.image_urls.isNotEmpty()) it.image_urls.first() else "",
                image_url_thumbnail = if (it.image_urls_thumbnails.isNotEmpty()) it.image_urls_thumbnails.first() else "",
                name = it.name,
                price = it.price
            )
        }
    }

    private fun dateAndTimePattern() =
        "${DateFormatCodes.MMM} ${DateFormatCodes.dd}, ${DateFormatCodes.yyyy} " +
                "${DateFormatCodes.HH}:${DateFormatCodes.mm} ${DateFormatCodes.a}"
}