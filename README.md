# Chuck Norris - RxJava API Client

https://chucknorris.io is a free JSON API for hand curated Chuck Norris facts

Plain Java client is [here](https://github.com/chucknorris-io/client-java)

## Usage

Retrieve random joke:

```kotlin
ChuckNorrisApiClient.getRandomJoke().subscribe(joke -> {
    println(joke.value)
});
```

More samples in [docs](/docs/index.md)

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