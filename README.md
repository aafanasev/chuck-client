# Chuck Norris - RxJava API Client

<p align="center">
    <img src="https://assets.chucknorris.host/img/chucknorris_logo_coloured_small@2x.png" width="300">
</p>

[ ![Download](https://api.bintray.com/packages/aafanasev/maven/chuck-norris/images/download.svg) ](https://bintray.com/aafanasev/maven/chuck-norris/_latestVersion)

https://chucknorris.io is a free JSON API for hand curated Chuck Norris facts

Plain Java client is [here](https://github.com/chucknorris-io/client-java)

## Usage

Kotlin

```kotlin
// create api client
val api = ChuckNorrisApiFactory().create()

// get random
api.getRandomJoke().subscribe { 
    randomJoke -> println(randomJoke.value) 
}

// search
api.searchJokes("php").subscribe { result ->
    println("""
            Found: ${result.total}
            First fact: ${result.jokes[0].value}
            """.trimIndent())
}
```

Java

```java
// create api client
ChuckNorrisApiService api = new ChuckNorrisApiFactory().create()

// get random from category
api.getRandomJoke("dev").subscribe(joke -> {
    System.out.println(joke.getValue());
});

// get all available categories
api.getCategories().subscribe(categories -> {
    System.out.println(categories);
});
```

More info in [samples](/sample/src/main/kotlin/com/aafanasev/chucknorrissample) and [docs](/docs/index.md)

## Install

Gradle

```groovy
// add repository
repositories {
    maven {
        url 'https://dl.bintray.com/aafanasev/maven'
    }
}

// add dependency
compile 'com.aafanasev:chuck-norris:1.1'
```

Maven

```xml
<dependency>
  <groupId>com.aafanasev</groupId>
  <artifactId>chuck-norris</artifactId>
  <version>1.1</version>
  <type>pom</type>
</dependency>
```