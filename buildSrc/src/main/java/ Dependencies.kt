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

}


object AndroidSdk {
    const val min = 21
    const val compile = 29
    const val target = compile
    const val applicationId="info.sanaebadi.dependecyinjection"
}

object Libraries {
    private object Versions {
        const val jetpack = "1.2.0"
        const val constraintLayout = "2.0.0"
        const val ktx = "1.3.1"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.jetpack}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
}

object TestLibraries {
    private object Versions {
        const val junit4 = "4.12"
        const val testRunner = "1.1.0-alpha4"
        const val espresso = "3.2.0"
    }

    const val junit4 = "junit:junit:${Versions.junit4}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}

object DaggerLib{
    const val daggerVersion = "2.21"

    const val dagger="com.google.dagger:dagger:$daggerVersion"
    const val daggerCompiler="com.google.dagger:dagger-compiler:$daggerVersion"
    const val daggerProcessor="com.google.dagger:dagger-android-processor:$daggerVersion"
    const val daggerSupport="com.google.dagger:dagger-android-support:$daggerVersion"

}