@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(deps.plugins.jvm)
}

allprojects {
    plugins.withType<JavaPlugin> {
        configure<JavaPluginExtension> {
            withSourcesJar()

            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }
    }

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.release.set(8)
    }

    tasks.withType<JavaExec> {
        args = listOf(
            "0", // node-id
            "0", // port-offset
            "highmem", // lowmem/highmem
            "members", // free/members
            "32" // storeid
        )
    }
}
