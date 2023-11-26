package ui

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selectors.byName
import com.codeborne.selenide.Selectors.byText
import com.codeborne.selenide.Selenide.element

// page_url = https://google.com
class GooglePage {
    private val cookies = element(byText("Accept all"))

    private val input = element(byName("q"))

    private val title = element("h3")

    fun search(key: String) = apply {
        input.sendKeys(key)
        input.pressEnter()
    }

    fun acceptCookies() = apply {
        cookies.click()
    }

    fun checkTitle(key: String) = apply {
        title.shouldHave(Condition.text(key))
    }
}
