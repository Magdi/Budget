plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(29)
    buildToolsVersion("29.0.3")

    defaultConfig {
        applicationId = "com.mmagdi.budget"
        minSdkVersion(26)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
        packagingOptions.exclude("META-INF/main.kotlin_module")
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Libs.kotlin_std)
    implementation(Libs.androidx_core)
    implementation(Libs.app_compat)
    implementation(Libs.material)
    implementation(Libs.constraint_layout)
    implementation(Libs.navigation_fragments)
    implementation(Libs.navigation_ui)
    testImplementation(Libs.junit)
    androidTestImplementation(Libs.test_ext)
    androidTestImplementation(Libs.test_espresso)
}