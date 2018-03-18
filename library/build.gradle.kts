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

plugins {
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
