/**
 * To define plugins
 */
object BuildPlugins {
    @JvmStatic
    val hiltDagger by lazy { "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}" }
}

/**
 * To define dependencies
 */
object Deps {
    @JvmStatic
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    @JvmStatic
    val timber by lazy { "com.jakewharton.timber:timber:${Versions.timber}" }
    @JvmStatic
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}" }
    @JvmStatic
    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    @JvmStatic
    val materialDesign by lazy { "com.google.android.material:material:${Versions.material}" }
    @JvmStatic
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }
    @JvmStatic
    val junit by lazy { "junit:junit:${Versions.jUnit}" }
    @JvmStatic
    val extJunit by lazy { "androidx.test.ext:junit:${Versions.extJunit}" }
    @JvmStatic
    val espressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.espressoCore}" }
    @JvmStatic
    val fragmentKtx by lazy { "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}" }
    @JvmStatic
    val viewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewModel}" }
    @JvmStatic
    val liveData by lazy { "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.liveData}" }
    @JvmStatic
    val coil by lazy { "io.coil-kt:coil:${Versions.coil}" }
    @JvmStatic
    val okhttp by lazy { "com.squareup.okhttp3:okhttp:${Versions.okhttp3}" }
    @JvmStatic
    val okhttpBom by lazy { "com.squareup.okhttp3:okhttp-bom:${Versions.okhttp3}" }
    @JvmStatic
    val loggingInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp3}" }
    @JvmStatic
    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
    @JvmStatic
    val retrofitConverterScalars by lazy { "com.squareup.retrofit2:converter-scalars:${Versions.retrofit}" }
    @JvmStatic
    val retrofitConverterMoshi by lazy { "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}" }
    @JvmStatic
    val moshiKotlin by lazy { "com.squareup.moshi:moshi-kotlin:${Versions.moshi}" }
    @JvmStatic
    val moshiAdapters by lazy { "com.squareup.moshi:moshi-adapters:${Versions.moshi}" }
    @JvmStatic
    val retrofitCoroutinesAdapter by lazy { "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutinesAdapter}" }
    @JvmStatic
    val coroutinesAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}" }
    @JvmStatic
    val coroutines by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}" }
    @JvmStatic
    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
    @JvmStatic
    val hiltCompiler by lazy { "com.google.dagger:hilt-compiler:${Versions.hilt}" }
    @JvmStatic
    val googleGson by lazy { "com.google.code.gson:gson:${Versions.gson}" }
    @JvmStatic
    val legacySupport by lazy { "androidx.legacy:legacy-support-v4:${Versions.support}" }
    @JvmStatic
    val navigationFragment by lazy { "androidx.navigation:navigation-fragment-ktx:${Versions.navComponent}" }
    @JvmStatic
    val navigationUi by lazy { "androidx.navigation:navigation-ui-ktx:${Versions.navComponent}" }

}
