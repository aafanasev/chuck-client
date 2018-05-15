package com.aafanasev.chucknorris

import com.aafanasev.kson.generated.KsonTypeAdapterFactory
import com.google.gson.Gson
import com.google.gson.GsonBuilder
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
     * @param useKson use KsonTypeAdapters
     */
    @JvmOverloads
    fun create(
            okHttpClient: OkHttpClient? = null,
            useKson: Boolean = true
    ): ChuckNorrisApiService = run {

        val gson = if (useKson) {
            GsonBuilder()
                    .registerTypeAdapterFactory(KsonTypeAdapterFactory())
                    .create()
        } else {
            Gson()
        }

        val builder = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))

        okHttpClient?.let {
            builder.client(it)
        }

        builder.build().create(ChuckNorrisApiService::class.java)
    }

}