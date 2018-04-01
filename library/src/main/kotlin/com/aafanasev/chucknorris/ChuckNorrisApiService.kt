package com.aafanasev.chucknorris

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ChuckNorrisApiService {

    @GET("search")
    fun searchJokes(@Query("query") query: String): Single<SearchResult>

    @GET("categories")
    fun getCategories(): Single<List<Category>>

    @GET("random")
    fun getRandomJoke(@Query("category") category: Category? = null): Single<Joke>

}