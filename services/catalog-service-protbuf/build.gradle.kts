plugins {
    id("java-library")
    id("com.google.protobuf") version "3.23.0"
}

group = "org.earelin.tenda"
version = "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}
