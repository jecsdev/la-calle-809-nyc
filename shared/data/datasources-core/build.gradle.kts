import de.jensklingenberg.ktorfit.gradle.ErrorCheckingMode

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.buildConfig)
    alias(libs.plugins.kotlinxSerialization)
    alias(libs.plugins.sqlDelight)
    alias(libs.plugins.com.google.ksp)
    alias(libs.plugins.ktorfit)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = BuildVersion.Environment.jvmTarget
            }
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "DataDatasourcesCore"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation(projects.shared.core.common)
            implementation(projects.shared.data.models)
            implementation(projects.shared.data.datasources)

            implementation(libs.bundles.layer.data.datasources.core)
        }

        commonTest.dependencies {
            implementation(kotlin("test"))
        }

        androidMain.dependencies {
            implementation(libs.bundles.android.data.core)
        }

        iosMain.dependencies {
            implementation(libs.bundles.ios.data.core)
        }

    }
}


android {
    namespace = "${BuildVersion.Environment.applicationId}.data.datasources.core"
    compileSdk = BuildVersion.Android.compileSdk

    defaultConfig {
        minSdk = BuildVersion.Android.minSdk
    }
    sourceSets["main"].apply {
        manifest.srcFile("src/androidMain/AndroidManifest.xml")
        res.srcDirs("src/androidMain/resources")
    }
    compileOptions {
        sourceCompatibility = BuildVersion.Environment.javaVersion
        targetCompatibility = BuildVersion.Environment.javaVersion
    }
}

buildConfig {
// BuildConfig configuration here.
// https://github.com/gmazzo/gradle-buildconfig-plugin#usage-in-kts
}

ktorfit {
    errorCheckingMode = ErrorCheckingMode.ERROR
    generateQualifiedTypeName = true
}

sqldelight {
    databases {
        create(BuildVersion.Environment.appDatabaseName) {
            // Database configuration here.
            // https://cashapp.github.io/sqldelight
            packageName.set("${BuildVersion.Environment.applicationId}.data.datasources.core.db")
        }
    }
}

tasks.register("testClasses") {
    println("Dummy classes")
}
