package com.aafanasev.chucknorris

import com.google.gson.annotations.SerializedName

typealias Category = String

data class Joke(
        @SerializedName("id") val id: String,
        @SerializedName("url") val url: String,
        @SerializedName("value") val value: String,
        @SerializedName("icon_url") val iconUrl: String
)

data class SearchResult(
        @SerializedName("total") val total: Int,
        @SerializedName("result") val jokes: List<Joke>
)