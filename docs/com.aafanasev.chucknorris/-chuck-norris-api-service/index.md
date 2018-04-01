[library](../../index.md) / [com.aafanasev.chucknorris](../index.md) / [ChuckNorrisApiService](./index.md)

# ChuckNorrisApiService

`interface ChuckNorrisApiService`

### Functions

| Name | Summary |
|---|---|
| [getCategories](get-categories.md) | `abstract fun getCategories(): Single<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Category`](../-category.md)`>>` |
| [getRandomJoke](get-random-joke.md) | `abstract fun getRandomJoke(): Single<`[`Joke`](../-joke/index.md)`>`<br>`abstract fun getRandomJoke(category: `[`Category`](../-category.md)`): Single<`[`Joke`](../-joke/index.md)`>` |
| [searchJokes](search-jokes.md) | `abstract fun searchJokes(query: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Single<`[`SearchResult`](../-search-result/index.md)`>` |
