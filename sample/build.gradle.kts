plugins {
	application
	kotlin("jvm")
}

application {
	mainClassName = "com.aafanasev.chucknorrissample.MainKt"
}

dependencies {
	implementation(project(":library"))
	implementation(kotlin("stdlib"))
}
