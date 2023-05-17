plugins {
    id("java-library")
    id("com.google.protobuf") version "0.9.3"
}

group = "org.earelin.tenda"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.grpc:grpc-protobuf:1.55.1")
    implementation("io.grpc:grpc-stub:1.55.1")
    compileOnly("jakarta.annotation:jakarta.annotation-api:2.1.0")
}
