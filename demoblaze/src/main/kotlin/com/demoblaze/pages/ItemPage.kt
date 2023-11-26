package com.demoblaze.pages

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.Selenide.element

// page_url = https://www.demoblaze.com/prod.html?idp_=1
class ItemPage {
    val h2SamsungGalaxy = element("h2[class='name']")

    val h3IncludesTax = element("h3[class='price-container']")

    val divMoreInformation = element("div[id='more-information']")

    val linkAddCart = element("a[class*='btn-success']")

    fun open(id: Int) = apply {
        Selenide.open("/prod.html?idp_=$id")
    }
}