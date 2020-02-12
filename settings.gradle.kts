rootProject.name = "ktor-simple-github-autorization"

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id.startsWith("org.jetbrains.kotlin.")) {
                val vKotlin: String by settings
                useVersion(vKotlin)
            }
        }
    }
}