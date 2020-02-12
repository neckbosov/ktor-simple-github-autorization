val vKtor: String by project
val vLogback: String by project

plugins {
    kotlin("jvm")
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("io.ktor:ktor-server-netty:$vKtor")
    implementation("io.ktor:ktor-server-core:$vKtor")
    implementation("io.ktor:ktor-html-builder:$vKtor")
    implementation("io.ktor:ktor-locations:$vKtor")
    implementation("io.ktor:ktor-auth:$vKtor")
    implementation("io.ktor:ktor-client-apache:$vKtor")
    implementation("io.ktor:ktor-client-apache:$vKtor")
    implementation("io.ktor:ktor-client-json-jvm:$vKtor")
    implementation("io.ktor:ktor-client-jackson:$vKtor")
    implementation("ch.qos.logback:logback-classic:$vLogback")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

kotlin.sourceSets["main"].kotlin.srcDirs("src")
sourceSets["main"].resources.srcDirs("resources")