buildscript {
    repositories {
        jcenter()
    }

    dependencies {
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:0.9.16")
    }
}

apply {
    plugin("org.jetbrains.dokka")
}

val dokka by tasks.getting(org.jetbrains.dokka.gradle.DokkaTask::class) {
    outputFormat = "html"
    outputDirectory = "$buildDir/javadoc"
}

val dokkaJar by tasks.creating(org.gradle.jvm.tasks.Jar::class) {
    group = JavaBasePlugin.DOCUMENTATION_GROUP
    description = "Chuck Norris API Client"
    classifier = "javadoc"
    from(dokka)
}

plugins {
    `maven-publish`
    kotlin("jvm")
}

dependencies {
    val retrofitGroup = "com.squareup.retrofit2"
    val retrofitVersion = "2.3.0"

    implementation(kotlin("stdlib"))
    compile(group = retrofitGroup, name = "retrofit", version = retrofitVersion)
    compile(group = retrofitGroup, name = "adapter-rxjava2", version = retrofitVersion)
    implementation(group = retrofitGroup, name = "converter-gson", version = retrofitVersion)
}

group = "com.aafanasev"
version = "0.0.1"

publishing {

    publications {

        create("default", MavenPublication::class.java) {
            artifactId = "chucknorrisapiclient"
            from(components["java"])
            artifact(dokkaJar)
        }
    }

    repositories {
        maven {
            url = uri("$buildDir/repository")
        }
    }

}
