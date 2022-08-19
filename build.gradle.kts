plugins {
    kotlin("jvm") version "1.5.10"
    application
    `maven-publish`
    id("org.openjfx.javafxplugin") version "0.0.10"
    `java-library`
}

group = "org.example"
version = "0.1.0"

application{
    mainClassName = "WindowsFloat"
}

javafx {
    modules("javafx.controls", "javafx.fxml", "javafx.web")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    implementation(kotlin("stdlib-jdk8"))

    implementation("com.google.guava:guava:30.1-jre")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    api("org.apache.commons:commons-math3:3.6.1")
}

