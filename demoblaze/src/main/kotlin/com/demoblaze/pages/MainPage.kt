package com.demoblaze.pages

  import com.codeborne.selenide.Selenide
import com.codeborne.selenide.Selenide.element
import com.codeborne.selenide.Selenide.elements
import com.codeborne.selenide.selector.ByText
import com.demoblaze.blocks.Cart
import com.demoblaze.models.User

// page_url = https://www.demoblaze.com
class MainPage {
    val linkHomeCurrent = element("li[class='nav-item active'] a[class='nav-link']")

    val linkAboutUs = element("a[data-target='#exampleModal']")

    val linkCart = element("a[id='cartur']")

    val linkLogin = element("a[id='login2']")

    val linkSigIn = element("a[id='signin2']")

    val inputSignUsername = element("input[id='sign-username']")

    val inputSignPassword = element("input[id='sign-password']")

    val signButton = element("button[onclick='register()']")

    val closeButton =
        element("html > body > div:nth-of-type(2) > div > div > div:nth-of-type(3) > button:nth-of-type(1)")

    val closePopupButton = element("html > body > div:nth-of-type(2) > div > div > div:nth-of-type(1) > button > span")

    val inputLoginUsername = element("input[id='loginusername']")

    val inputLoginPassword = element("input[id='loginpassword']")

    val loginButton = element("button[onclick='logIn()']")

    val items = elements("div[class*='col-lg-4 col-md-6 mb-4']").map { Cart(it) }.toList()

    fun open() = apply {
        Selenide.open("/")
    }

    fun signUp(user: User) = apply {
        inputSignUsername.sendKeys(user.username)
        inputSignPassword.sendKeys(user.password)
        signButton.click()
        Selenide.switchTo().activeElement()
        element(ByText("OK")).click()
        Thread.sleep(5000)
    }

    fun login(user: User) = apply {
        inputLoginUsername.sendKeys(user.username)
        inputLoginPassword.sendKeys(user.password)
        loginButton.click()
        Selenide.switchTo().activeElement().click()
        Thread.sleep(5000)
    }
}