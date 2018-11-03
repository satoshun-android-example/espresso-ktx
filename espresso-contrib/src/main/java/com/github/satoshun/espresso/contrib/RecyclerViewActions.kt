package com.github.satoshun.espresso.contrib

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.contrib.RecyclerViewActions
import org.hamcrest.Matcher

fun ViewInteraction.actionOnItemAtPosition(position: Int, action: ViewAction): ViewInteraction {
  return perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(position, action))
}

fun ViewInteraction.scrollToHolder(matcher: Matcher<out RecyclerView.ViewHolder>): ViewInteraction {
  return perform(RecyclerViewActions.scrollToHolder(matcher))
}
