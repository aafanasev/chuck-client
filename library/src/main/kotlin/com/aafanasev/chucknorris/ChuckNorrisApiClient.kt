package com.aafanasev.chucknorris

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object ChuckNorrisApiClient {

    private const val BASE_URL = "https://api.chucknorris.io/jokes/"

    private val service by lazy {
        Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ChuckNorrisApiService::class.java)
    }

    /**
     * Search jokes
     */
    @JvmStatic
    fun searchJokes(query: String) = service.searchJokes(query)

    /**
     * Get all categories
     */
    @JvmStatic
    fun getCategories() = service.getCategories()

    /**
     * Get random joke
     * @param category optional
     */
    @JvmStatic
    fun getRandomJoke(category: Category? = null) = service.getRandomJoke(category)

}
