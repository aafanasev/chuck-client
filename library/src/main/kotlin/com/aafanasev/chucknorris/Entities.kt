package com.aafanasev.chucknorris

import com.aafanasev.kson.annotation.Kson
import com.google.gson.annotations.SerializedName

typealias Category = String

@Kson
data class Joke(
        @SerializedName("id") val id: String,
        @SerializedName("url") val url: String,
        @SerializedName("value") val value: String,
        @SerializedName("icon_url") val iconUrl: String
)

@Kson
data class SearchResult(
        @SerializedName("total") val total: Int,
        @SerializedName("result") val jokes: List<Joke>
)