package com.github.satoshun.espresso.intent

import android.content.Intent
import android.net.Uri
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.IntentMatchers
import org.hamcrest.CoreMatchers
import org.hamcrest.Matcher

fun intended(init: IntendedScope.() -> Unit) {
  val scope = IntendedScope()
  scope.init()
  Intents.intended(CoreMatchers.allOf(scope.matchers))
}

class IntendedScope {
  internal val matchers = mutableListOf<Matcher<Intent>>()

  fun hasAction(action: String) {
    matchers += IntentMatchers.hasAction(action)
  }

  fun hasData(uri: Uri) {
    matchers += IntentMatchers.hasData(uri)
  }

  fun toPackage(packageName: String) {
    matchers += IntentMatchers.toPackage(packageName)
  }
}
