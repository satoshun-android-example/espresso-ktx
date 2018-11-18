object Vers {
  const val compile_sdk = 28
  const val min_sdk = 21
  const val target_sdk = 28

  const val kotlin = "1.3.0"
}

object Libs {
  const val android_plugin = "com.android.tools.build:gradle:3.2.1"
  const val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Vers.kotlin}"
  const val versions_plugin = "com.github.ben-manes:gradle-versions-plugin:0.20.0"

  const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Vers.kotlin}"

  const val ktx = "androidx.core:core-ktx:1.0.0"

  const val appcompat = "androidx.appcompat:appcompat:1.0.0"
  const val recyclerview = "androidx.recyclerview:recyclerview:1.0.0"
  const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.0-alpha2"

  const val material = "com.google.android.material:material:1.0.0"

  const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.0.0"
  const val livedata = "androidx.lifecycle:lifecycle-livedata:2.0.0"
  const val lifecycle_compiler = "androidx.lifecycle:lifecycle-compiler:2.0.0"

  const val android_annotation = "androidx.annotation:annotation:1.0.0"

  const val junit = "junit:junit:4.12"
  const val truth = "com.google.truth:truth:0.42"
  const val mockito_kotlin = "com.nhaarman:mockito-kotlin-kt1.1:1.5.0"
  const val test_runner = "androidx.test:runner:1.1.0"
  const val test_rule = "androidx.test:rules:1.1.0"
  const val test_ext_junit = "androidx.test.ext:junit:1.0.0"
  const val test_core = "androidx.test:core:1.0.0"
  const val robolectric = "org.robolectric:robolectric:4.0.2"

  const val espresso = "androidx.test.espresso:espresso-core:3.1.0"
  const val espresso_web = "androidx.test.espresso:espresso-web:3.1.0"
  const val espresso_contrib = "androidx.test.espresso:espresso-contrib:3.1.0"
  const val espresso_intent = "androidx.test.espresso:espresso-intents:3.1.0"
}
