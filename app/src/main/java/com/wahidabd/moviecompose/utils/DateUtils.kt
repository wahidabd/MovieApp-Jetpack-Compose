package com.wahidabd.moviecompose.utils

import java.text.SimpleDateFormat
import java.util.*

fun greetingBasedOnTime(): String {
    val c: Calendar = Calendar.getInstance()
    return when (c.get(Calendar.HOUR_OF_DAY)) {
        in 0..11 -> {
            "Good Morning"
        }
        in 12..15 -> {
            "Good Afternoon"
        }
        in 16..20 -> {
            "Good Evening"
        }
        else -> {
            "Goodnight"
        }
    }
}

fun now() = System.currentTimeMillis()

val movieResponseDateFormat = SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH)
val movieDisplayDateFormat = SimpleDateFormat("MM dd yyyy", Locale.ENGLISH)