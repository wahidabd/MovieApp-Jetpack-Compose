package com.wahidabd.moviecompose.core.data

import com.google.gson.annotations.SerializedName
import com.wahidabd.moviecompose.BuildConfig
import kotlinx.android.parcel.IgnoredOnParcel

data class Cast(
    @SerializedName("character")
    val character: String,
    @SerializedName("credit_id")
    val creditId: String,
    @SerializedName("gender")
    val gender: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("order")
    val order: Int,
    @SerializedName("profile_path")
    val profilePath: String
) {
    @IgnoredOnParcel
    val thumbnail: String
        get() = String.format(BuildConfig.THUMBNAIL_PATH, profilePath)
}