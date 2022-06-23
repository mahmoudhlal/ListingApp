plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = ConfigData.compileSdkVersion

    defaultConfig {
        minSdk = ConfigData.minSdkVersion
        targetSdk = ConfigData.targetSdkVersion

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
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
    implementation(Deps.coreKtx)
    implementation(Deps.kotlin)
    implementation(Deps.okhttpBom)
    implementation(Deps.loggingInterceptor)
    implementation(Deps.okhttp)
    implementation(Deps.retrofit)
    implementation(Deps.retrofitConverterScalars)
    implementation(Deps.retrofitConverterMoshi)
    implementation(Deps.moshiKotlin)
    implementation(Deps.moshiAdapters)
    implementation(Deps.coroutinesAndroid)
    implementation(Deps.coroutines)
    implementation(Deps.retrofitCoroutinesAdapter)
}
