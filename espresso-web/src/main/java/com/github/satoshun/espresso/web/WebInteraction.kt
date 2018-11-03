package com.github.satoshun.espresso.web

import androidx.test.espresso.web.model.Evaluation
import androidx.test.espresso.web.sugar.Web.WebInteraction
import androidx.test.espresso.web.webdriver.DriverAtoms

fun <E> WebInteraction<E>.clearElement(): WebInteraction<Evaluation> {
  return perform(DriverAtoms.clearElement())
}
