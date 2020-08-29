const val kotlinVersion = "1.3.72"

object BuildPlugins {

    object Versions {
        const val buildToolsVersion = "4.0.1"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
    const val kaptPlugin = "kotlin-kapt"
    const val androidLibrary = "com.android.library"

}


object AndroidSdk {
    const val min = 21
    const val compile = 29
    const val target = compile
    const val applicationId = "info.sanaebadi.dependecyinjection"
}

object Libraries {
    private object Versions {
        const val appCompat = "1.2.0"
        const val lifeCycle = "2.2.0"
        const val constraintLayout = "2.0.0"
        const val ktx = "1.3.1"
        const val fragment = "1.2.5"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val material = "com.google.android.material:material:${Versions.appCompat}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeCycle}"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifeCycle}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
}

object TestLibraries {
    private object Versions {
        const val junit4 = "4.12"
        const val testRunner = "1.1.0-alpha4"
        const val espresso = "3.2.0"
        const val truth = "1.0.1"
        const val archTesting = "2.1.0"
    }

    const val junit4 = "junit:junit:${Versions.junit4}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val truth = "com.google.truth:truth:${Versions.truth}"
    const val archTesting = "androidx.arch.core:core-testing:${Versions.archTesting}"
}

object DaggerLib {
    const val daggerVersion = "2.26"

    const val dagger = "com.google.dagger:dagger:$daggerVersion"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:$daggerVersion"
    const val daggerProcessor = "com.google.dagger:dagger-android-processor:$daggerVersion"
    const val daggerSupport = "com.google.dagger:dagger-android-support:$daggerVersion"

}