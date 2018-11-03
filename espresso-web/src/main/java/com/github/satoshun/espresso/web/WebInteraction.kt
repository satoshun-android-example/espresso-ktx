package com.github.satoshun.espresso.web

import androidx.test.espresso.web.model.Evaluation
import androidx.test.espresso.web.sugar.Web.WebInteraction
import androidx.test.espresso.web.webdriver.DriverAtoms
import androidx.test.espresso.web.webdriver.Locator

fun <E> WebInteraction<E>.clearElement(): WebInteraction<Evaluation> {
  return perform(DriverAtoms.clearElement())
}

fun <E> WebInteraction<E>.webKeys(text: String): WebInteraction<Evaluation> {
  return perform(DriverAtoms.webKeys(text))
}

fun <E> WebInteraction<E>.webClick(): WebInteraction<Evaluation> {
  return perform(DriverAtoms.webClick())
}

fun <R> WebInteraction<R>.findElement(locator: Locator, value: String): WebInteraction<R> {
  return withElement(DriverAtoms.findElement(locator, value))
}
