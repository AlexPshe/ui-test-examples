package com.parasoft.parabank.ui

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.Selenide.element
import com.parasoft.parabank.models.AccountType
import com.parasoft.parabank.models.DEFAULT

// page_url = https://parabank.parasoft.com/parabank/openaccount.htm
class OpenNewAccountPage {
    val selectType = element("select[id='type']")

    val selectFromAccount = element("select[id='fromAccountId']")

    val openNewAccountButton = element("input[class='button']")

    val h1AccountOpened = element("h1[class='title']")

    val linkNewAccount = element("a[id='newAccountId']")


    fun open() = apply {
        Selenide.open("/parabank/openaccount.htm")
    }

    fun openNewAccount(accountType: AccountType, accountNumber: String = DEFAULT): String = apply {
        selectType.selectOption(accountType.value)
        if (accountNumber != DEFAULT) selectFromAccount.selectOption(accountNumber)
        Thread.sleep(1000)
        openNewAccountButton.click()
        return linkNewAccount.text()
    }.toString()
}