package com.parasoft.parabank.automated

import com.codeborne.selenide.Condition
import com.parasoft.parabank.models.AccountType
import com.parasoft.parabank.models.Customer
import com.parasoft.parabank.models.DEFAULT
import com.parasoft.parabank.ui.OpenNewAccountPage
import com.parasoft.parabank.ui.RegistrationPage
import makeRandomInstance
import org.junit.jupiter.api.Test

class OpenNewAccountTest : BaseTest() {
    @Test
    fun `Authorized user can create new account`() {
        val customer: Customer = makeRandomInstance()

        RegistrationPage().open().register(customer)

        OpenNewAccountPage().open().apply {
            val accountNumber = openNewAccount(AccountType.CHECKING, DEFAULT)

            h1AccountOpened.shouldHave(Condition.text("Account Opened!"))
        }
    }
}