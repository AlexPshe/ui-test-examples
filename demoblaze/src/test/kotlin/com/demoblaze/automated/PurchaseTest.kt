package com.demoblaze.automated

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide
import com.demoblaze.models.Customer
import com.demoblaze.pages.CartPage
import com.demoblaze.pages.ItemPage
import com.demoblaze.pages.MainPage
import com.demoblaze.randomData.makeRandomInstance
import org.junit.jupiter.api.Test

class PurchaseTest : BaseTest() {
    @Test
    fun `Purchase Test`() {
        val customer: Customer = makeRandomInstance()

        Selenide.open("")
        MainPage().apply {
            linkSigIn.click()
            signUp(customer.user)
            linkLogin.click()
            login(customer.user)

            val itemTitle = items.first().title.text()
            items.first().title.click()

            ItemPage().linkAddCart.click()

            CartPage().open().apply {
                items.first().shouldHave(Condition.text(itemTitle))
                buy(customer)
            }
        }
    }
}