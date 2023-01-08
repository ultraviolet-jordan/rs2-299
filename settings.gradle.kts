rootProject.name = "rs2-299"

dependencyResolutionManagement {
    repositories(RepositoryHandler::mavenCentral)

    versionCatalogs {
        create("deps") {
            plugin("jvm", "org.jetbrains.kotlin.jvm").version("1.8.0")
        }
    }
}

val modules = listOf(
    "client",
    "deob-annotations"
)

include(modules)
