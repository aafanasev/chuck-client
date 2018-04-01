package com.aafanasev.chucknorris

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * ChuckNorrisApiService factory
 */
class ChuckNorrisApiFactory {

    companion object {
        private const val BASE_URL = "https://api.chucknorris.io/jokes/"
    }

    /**
     * @param okHttpClient custom OkHttpClient
     */
    @JvmOverloads
    fun create(okHttpClient: OkHttpClient? = null): ChuckNorrisApiService = run {
        val builder = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())

        okHttpClient?.let {
            builder.client(it)
        }

        builder.build().create(ChuckNorrisApiService::class.java)
    }

}