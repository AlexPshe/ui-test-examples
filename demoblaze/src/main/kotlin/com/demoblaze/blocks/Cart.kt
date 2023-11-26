package com.demoblaze.blocks

import com.codeborne.selenide.SelenideElement

class Cart(val element: SelenideElement) {
    val title =
        element.find(".card-title")
}