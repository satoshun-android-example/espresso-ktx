package com.github.satoshun.espresso.action

import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions

fun ViewInteraction.actionWithAssertions(viewAction: ViewAction): ViewInteraction {
  return perform(ViewActions.actionWithAssertions(viewAction))
}

fun ViewInteraction.clearText(): ViewInteraction {
  return perform(ViewActions.clearText())
}

fun ViewInteraction.click(): ViewInteraction {
  return perform(ViewActions.click())
}

fun ViewInteraction.swipeLeft(): ViewInteraction {
  return perform(ViewActions.swipeLeft())
}

fun ViewInteraction.swipeRight(): ViewInteraction {
  return perform(ViewActions.swipeRight())
}

fun ViewInteraction.swipeDown(): ViewInteraction {
  return perform(ViewActions.swipeDown())
}

fun ViewInteraction.swipeUp(): ViewInteraction {
  return perform(ViewActions.swipeUp())
}

fun ViewInteraction.typeText(stringToBeTyped: String): ViewInteraction {
  return perform(ViewActions.typeText(stringToBeTyped))
}

fun ViewInteraction.closeSoftKeyboard(): ViewInteraction {
  return perform(ViewActions.closeSoftKeyboard())
}
