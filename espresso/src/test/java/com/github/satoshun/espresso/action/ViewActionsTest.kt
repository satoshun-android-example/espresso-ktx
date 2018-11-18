package com.github.satoshun.espresso.action

import android.app.Activity
import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
internal class ViewActionsTest {
  @Test
  fun click() {
    val scenario = ActivityScenario.launch(Activity::class.java)
    scenario.moveToState(Lifecycle.State.RESUMED)
    Espresso
      .onView(ViewMatchers.withId(android.R.id.content))
      .click()
  }
}
