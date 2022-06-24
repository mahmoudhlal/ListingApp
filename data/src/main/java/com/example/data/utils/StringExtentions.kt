package com.example.data.utils

import java.text.SimpleDateFormat
import java.util.*

fun String.toFormatDate(pattern: String): String {
    val date = this.toDate()
    return try {
        customFormatter(pattern).format(this)
    } catch (e: Exception) {
        ""
    }
}

fun String.toDate(): Date? {
    val pattern = "yyyy-MM-dd HH:mm:ss"
    val sdf = SimpleDateFormat(pattern, Locale.US)
    return sdf.parse(this)
}

private fun customFormatter(pattern: String): SimpleDateFormat {
    return SimpleDateFormat(pattern, Locale.US)
}