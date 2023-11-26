package ui.pages

import com.codeborne.selenide.Selenide.*

// page_url = https://lp.jetbrains.com/jetbrains-aqua-test-page/
class TestPage {
    val elementCollection = elements("div[data-test='feature-icon-with-title']")

    val title = element("h2[data-test='title']")

    val emailField = element("input[name='email']")

    val inputField = element("input[name='input']")

    val checkboxes = elements("span[data-test='checkbox']")

    val radioButtons = elements("input[data-test='radio-button-control']")

    val selectorDown = element("svg[data-test='down-icon']")

    val selectMenuItems = elements("button[data-test='select-menu-item']")

    val textarea = element("textarea[data-test^='textarea']")

    val submit = element("button[data-test='button']")

    val errorMessage = element("div[data-test='input__error-message']")

    val submittedForm = element("div[class='wt-text-1 wt-text-1_hardness_hard wt-text-1_theme_dark']")

    fun open() = apply {
        open("https://lp.jetbrains.com/jetbrains-aqua-test-page/")
    }
}