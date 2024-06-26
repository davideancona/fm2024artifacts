plugins {
    id("java")
}

group = "rml_instrumentation"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/com.google.code.gson/gson
    implementation("com.google.code.gson:gson:2.10.1")
    // https://mvnrepository.com/artifact/jakarta.websocket/jakarta.websocket-client-api
    compileOnly("jakarta.websocket:jakarta.websocket-client-api:2.1.1")

}

tasks.test {
    useJUnitPlatform()
}