object Versions {
    val kotlin_version = "1.3.61"
    val navigation = "2.2.1"
}

object Libs {
    val kotlin_std = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
    val androidx_core = "androidx.core:core-ktx:1.3.0"
    val app_compat = "androidx.appcompat:appcompat:1.1.0"
    val material = "com.google.android.material:material:1.1.0"
    val constraint_layout = "androidx.constraintlayout:constraintlayout:1.1.3"
    val navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    val navigation_fragments = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"

    //testing
    val junit = "junit:junit:4.13"
    val test_ext = "androidx.test.ext:junit:1.1.1"
    val test_espresso = "androidx.test.espresso:espresso-core:3.2.0"
    val robolectric = "org.robolectric:robolectric:4.3"
    val mockk = "io.mockk:mockk:1.10.0"
}
