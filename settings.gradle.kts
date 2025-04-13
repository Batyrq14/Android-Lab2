pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.github.com/Batyrq14/ChatLib")
            credentials {
                username = "Batyrq14"
                password = "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" // or use from `github.properties`
            }
        }
    }
}

rootProject.name = "Lab2"
include(":app")
 