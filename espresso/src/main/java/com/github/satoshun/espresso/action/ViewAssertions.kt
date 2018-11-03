package com.github.satoshun.espresso.action

import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.assertion.ViewAssertions

fun ViewInteraction.doesNotExist(): ViewInteraction {
  return check(ViewAssertions.doesNotExist())
}
