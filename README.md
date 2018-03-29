# Chuck Norris - RxJava API Client

<p align="center">
    <img src="https://assets.chucknorris.host/img/chucknorris_logo_coloured_small@2x.png" width="300">
</p>

https://chucknorris.io is a free JSON API for hand curated Chuck Norris facts

Plain Java client is [here](https://github.com/chucknorris-io/client-java)

## Usage

Retrieve random joke (*kotlin*):

```kotlin
ChuckNorrisApiClient.getRandomJoke().subscribe { 
    randomJoke -> println(randomJoke.value) 
}
```

Search jokes (*kotlin*):

```kotlin
ChuckNorrisApiClient.searchJokes("php").subscribe { result ->
    println("""
            Found: ${result.total}
            First fact: ${result.jokes[0].value}
            """.trimIndent())
}
```

Get all categories (*java*):

```java
ChuckNorrisApiClient.getCategories().subscribe(categories -> {
    System.out.println(categories);
});
```

More info in [samples](tree/master/sample/src/main/kotlin/com/aafanasev/chucknorrissample) and [docs](/docs/index.md)

## Install

### Gradle

**build.gradle**

Add repository:

```groovy
repositories {
    maven {
        url 'https://dl.bintray.com/aafanasev/maven'
    }
}
```

Add dependency:

```groovy
compile 'com.aafanasev:chuck-norris:1.0'
```

### Maven

**pom.xml**

```xml
<dependency>
  <groupId>com.aafanasev</groupId>
  <artifactId>chuck-norris</artifactId>
  <version>1.0</version>
  <type>pom</type>
</dependency>
```