plugins {
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib"))
    compile(group = "com.squareup.retrofit2", name = "retrofit", version = "2.3.0")
    compile(group = "com.squareup.retrofit2", name = "adapter-rxjava2", version = "2.3.0")
    implementation(group = "com.squareup.retrofit2", name = "converter-gson", version = "2.3.0")
}
