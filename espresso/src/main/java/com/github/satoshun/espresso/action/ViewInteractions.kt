package com.github.satoshun.espresso.action

import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions

fun ViewInteraction.click(): ViewInteraction {
  return perform(ViewActions.click())
}
