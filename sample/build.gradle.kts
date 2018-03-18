plugins {
    application
    kotlin("jvm")
}

application {
    mainClassName = "com.aafanasev.chucknorrissample.KotlinSample"
}

dependencies {
    implementation(project(":library"))
    implementation(kotlin("stdlib"))
}
