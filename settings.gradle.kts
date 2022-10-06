rootProject.name = "mail-service-sdk-micronaut"

val localSettings = file("local.settings.gradle.kts")
if (localSettings.exists()) {
    apply(from = localSettings)
}

val isCiServer = System.getenv().containsKey("CI")
buildCache {
    local {
        isEnabled = !isCiServer
    }
}
