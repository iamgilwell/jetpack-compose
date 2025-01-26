plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.rivabu.bankingapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.rivabu.bankingapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.15"
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}
//configurations.all {
//    resolutionStrategy {
//        force("androidx.compose.ui:ui-tooling:1.5.0")
//        force("androidx.compose.ui:ui-tooling-data:1.5.0")
//        force("androidx.compose.ui:ui-tooling-preview:1.5.0")
//    }
//}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.27.0")
    implementation("androidx.compose.material:material-icons-extended:1.7.6")

    // Compose UI
    implementation("androidx.compose.ui:ui:1.7.6")
    // Compose Material Design
    implementation("androidx.compose.material:material:1.7.6")
    // Compose Preview
    implementation("androidx.compose.ui:ui-tooling-preview:1.7.6")
    // Optional: Add Compose Tooling for debugging
    implementation ("androidx.compose.ui:ui-tooling")
    implementation ("androidx.compose.ui:ui-tooling-preview")

    debugImplementation("androidx.compose.ui:ui-tooling:1.7.6")


    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}
