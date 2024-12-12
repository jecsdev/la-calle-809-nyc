import org.gradle.api.JavaVersion

object BuildVersion {
    object Environment {
        const val applicationId = "io.afalabarce.template.kmm"
        const val appName = "KMM Template"
        const val appVersion = 100
        const val appVersionCode = "1.0.0"
        val javaVersion = JavaVersion.VERSION_17
        const val jvmTarget = "17"
        const val appDatabaseName = "KmmDatabase"
    }

    object Android {
        const val minSdk = 24
        const val compileSdk = 35
    }
}