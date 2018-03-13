plugins {
	application
	kotlin("jvm")
}

application {
	mainClassName = "com.aafanasev.chucknorris.Main"
}

dependencies {
	implementation(project(":library"))
	implementation(kotlin("stdlib"))
}
