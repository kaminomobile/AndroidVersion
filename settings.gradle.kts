pluginManagement {
    plugins {
        kotlin("jvm") version "1.4.21"
        id("com.gradle.plugin-publish") version "0.12.0"
    }
}

rootProject.name = "android-version-project"

include(":plugin")

project(":plugin").name = "android-version"