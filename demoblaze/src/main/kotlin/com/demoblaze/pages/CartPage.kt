package com.demoblaze.pages

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.Selenide.element
import com.demoblaze.models.Customer

// page_url = https://www.demoblaze.com/cart.html
class CartPage {
    val orderButton = element("button[data-toggle='modal']")

    val items = element("tbody[id='tbodyid']").findAll("tr")

    val inputName = element("input[id='name']")

    val inputCountry = element("input[id='country']")

    val inputCity = element("input[id='city']")

    val inputCard = element("input[id='card']")

    val inputMonth = element("input[id='month']")

    val inputYear = element("input[id='year']")

    val buttonPurchase = element("button[onclick='purchaseOrder()']")

    fun open() = apply {
        Selenide.open("/cart.html")
    }

    fun buy(customer: Customer) = apply {
        inputName.sendKeys(customer.name)
        inputCountry.sendKeys(customer.address.country)
        inputCity.sendKeys(customer.address.city)
        inputCard.sendKeys(customer.card.number)
        buttonPurchase.click()
    }
}