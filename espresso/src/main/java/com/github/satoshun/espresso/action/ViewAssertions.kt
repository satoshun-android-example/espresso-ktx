package com.github.satoshun.espresso.action

import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers

fun ViewInteraction.withText(text: String): ViewInteraction {
  return check(ViewAssertions.matches(ViewMatchers.withText(text)))
}
