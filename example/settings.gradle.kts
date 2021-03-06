pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenLocal()
    }

    plugins {
        kotlin("jvm") version "1.4.21"
        kotlin("android") version "1.4.21"
        id("com.android.application") version "7.0.0-alpha03"
        id("si.kamino.version") version "2.0.1-SNAPSHOT"
    }

    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "com.android.application" -> useModule("com.android.tools.build:gradle:7.0.0-alpha03")
                "si.kamino.version" -> useModule("si.kamino.gradle:android-version:2.0.1-SNAPSHOT")
            }
        }
    }
}

rootProject.name = "android-version-example"
