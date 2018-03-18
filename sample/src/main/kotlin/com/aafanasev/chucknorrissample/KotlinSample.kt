@file:JvmName("KotlinSample")

package com.aafanasev.chucknorrissample

import com.aafanasev.chucknorris.ChuckNorrisApiClient

fun main(args: Array<String>) {

    println("\n--- all categories ---\n")

    ChuckNorrisApiClient.getCategories().subscribe { categories -> println(categories) }

    println("\n--- random joke ---\n")

    ChuckNorrisApiClient.getRandomJoke().subscribe { randomJoke -> println(randomJoke.value) }

    println("\n--- random joke from category ---\n")

    ChuckNorrisApiClient.getRandomJoke("dev").subscribe { randomJoke -> println(randomJoke.value) }

    println("\n--- search jokes ---\n")

    ChuckNorrisApiClient.searchJokes("java").subscribe { result ->
        println("""
            Found: ${result.total}
            First joke: ${result.jokes[0].value}
            """.trimIndent())
    }

}
