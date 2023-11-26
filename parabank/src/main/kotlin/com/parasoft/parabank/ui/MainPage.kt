package com.parasoft.parabank.ui

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.Selenide.element

// page_url = https://parabank.parasoft.com/
class MainPage {
    val linkRegister =
        element("html > body > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > div > p:nth-of-type(2) > a")


    fun open() {
        Selenide.open("/")
    }
}