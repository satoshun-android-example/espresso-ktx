package com.github.satoshun.espresso.action

import android.app.Activity
import android.view.ViewGroup
import android.widget.EditText
import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
internal class ViewActionsTest {
  @Test
  fun actionWithAssertions() {
    val scenario = ActivityScenario.launch(Activity::class.java)
    scenario.moveToState(Lifecycle.State.RESUMED)
    Espresso
      .onView(ViewMatchers.withId(android.R.id.content))
      .actionWithAssertions(ViewActions.click())
  }

  @Test
  fun clearText() {
    val id = 100
    val scenario = ActivityScenario.launch(Activity::class.java)
    scenario.moveToState(Lifecycle.State.RESUMED)
    scenario.onActivity {
      val edit = EditText(it)
      edit.id = id
      it.findViewById<ViewGroup>(android.R.id.content).addView(edit)
    }
    Espresso
      .onView(ViewMatchers.withId(id))
      .clearText()
  }

  @Test
  fun click() {
    val scenario = ActivityScenario.launch(Activity::class.java)
    scenario.moveToState(Lifecycle.State.RESUMED)
    Espresso
      .onView(ViewMatchers.withId(android.R.id.content))
      .click()
  }

  @Test
  fun swipeLeft() {
    val scenario = ActivityScenario.launch(Activity::class.java)
    scenario.moveToState(Lifecycle.State.RESUMED)
    Espresso
      .onView(ViewMatchers.withId(android.R.id.content))
      .swipeLeft()
  }

  @Test
  fun swipeRight() {
    val scenario = ActivityScenario.launch(Activity::class.java)
    scenario.moveToState(Lifecycle.State.RESUMED)
    Espresso
      .onView(ViewMatchers.withId(android.R.id.content))
      .swipeRight()
  }

  @Test
  fun swipeDown() {
    val scenario = ActivityScenario.launch(Activity::class.java)
    scenario.moveToState(Lifecycle.State.RESUMED)
    Espresso
      .onView(ViewMatchers.withId(android.R.id.content))
      .swipeDown()
  }

  @Test
  fun swipeUp() {
    val scenario = ActivityScenario.launch(Activity::class.java)
    scenario.moveToState(Lifecycle.State.RESUMED)
    Espresso
      .onView(ViewMatchers.withId(android.R.id.content))
      .swipeUp()
  }

  @Test
  fun typeText() {
    val id = 100
    val scenario = ActivityScenario.launch(Activity::class.java)
    scenario.moveToState(Lifecycle.State.RESUMED)
    scenario.onActivity {
      val edit = EditText(it)
      edit.id = id
      it.findViewById<ViewGroup>(android.R.id.content).addView(edit)
    }

    Espresso
      .onView(ViewMatchers.withId(id))
      .typeText("type")
  }

  @Ignore("not support? https://github.com/robolectric/robolectric/issues/4148")
  @Test
  fun closeSoftKeyboard() {
    val id = 100
    val scenario = ActivityScenario.launch(Activity::class.java)
    scenario.moveToState(Lifecycle.State.RESUMED)
    scenario.onActivity {
      val edit = EditText(it)
      edit.id = id
      it.findViewById<ViewGroup>(android.R.id.content).addView(edit)
    }

    Espresso
      .onView(ViewMatchers.withId(id))
      .typeText("type")
      .closeSoftKeyboard()
  }
}
