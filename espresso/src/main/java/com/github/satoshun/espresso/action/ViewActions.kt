package com.github.satoshun.espresso.action

import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions

fun ViewInteraction.click(): ViewInteraction {
  return perform(ViewActions.click())
}

fun ViewInteraction.typeText(stringToBeTyped: String): ViewInteraction {
  return perform(ViewActions.typeText(stringToBeTyped))
}

fun ViewInteraction.closeSoftKeyboard(): ViewInteraction {
  return perform(ViewActions.closeSoftKeyboard())
}
