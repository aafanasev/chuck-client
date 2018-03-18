package com.aafanasev.chucknorris

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object ChuckNorrisApiClient : ChuckNorrisApiService {

    private const val BASE_URL = "https://api.chucknorris.io/jokes/"

    private val service by lazy {
        Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ChuckNorrisApiService::class.java)
    }

    override fun searchJokes(query: String) = service.searchJokes(query)

    override fun getCategories() = service.getCategories()

    override fun getRandomJoke(category: Category?) = service.getRandomJoke(category)

}
