plugins {
    id(BuildPlugins.androidLibrary)
    id(BuildPlugins.kotlinAndroidExtensions)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kaptPlugin)
}
android {
    compileSdkVersion(AndroidSdk.compile)
    defaultConfig {
        minSdkVersion(AndroidSdk.min)
        targetSdkVersion(AndroidSdk.target)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles ( "consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.appCompat)
    implementation(Libraries.ktxCore)
    implementation(Libraries.constraintLayout)

    implementation(Libraries.viewModel)
    implementation(Libraries.liveData)

    implementation(Libraries.fragmentKtx)
    implementation("androidx.recyclerview:recyclerview:1.1.0")

    testImplementation(TestLibraries.junit4)
    androidTestImplementation(TestLibraries.testRunner)
    androidTestImplementation(TestLibraries.espresso)

    implementation(DaggerLib.dagger)
    implementation(DaggerLib.daggerSupport)
    kapt(DaggerLib.daggerCompiler)
    kapt(DaggerLib.daggerProcessor)

    implementation(project(mapOf("path" to ":di")))
    implementation(project(mapOf("path" to ":appdeps")))


}