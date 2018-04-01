@file:JvmName("KotlinSample")

package com.aafanasev.chucknorrissample

import com.aafanasev.chucknorris.ChuckNorrisApiFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

fun main(args: Array<String>) {

    val interceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BASIC
    }

    val httpClient = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()

    val api = ChuckNorrisApiFactory().create(httpClient)

    println("\n--- all categories ---\n")

    api.getCategories().subscribe { categories -> println(categories) }

    println("\n--- random joke ---\n")

    api.getRandomJoke().subscribe { randomJoke -> println(randomJoke.value) }

    println("\n--- random joke from category ---\n")

    api.getRandomJoke("dev").subscribe { randomJoke -> println(randomJoke.value) }

    println("\n--- search jokes ---\n")

    api.searchJokes("java").subscribe { result ->
        println("""
            Found: ${result.total}
            First joke: ${result.jokes[0].value}
            """.trimIndent())
    }

}
