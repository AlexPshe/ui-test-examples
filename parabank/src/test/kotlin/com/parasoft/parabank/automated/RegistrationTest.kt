package com.parasoft.parabank.automated

import com.codeborne.selenide.Condition
import com.parasoft.parabank.models.Customer
import com.parasoft.parabank.ui.RegistrationPage
import com.parasoft.parabank.utils.TMSLink
import makeRandomInstance
import org.junit.jupiter.api.Test

class RegistrationTest : BaseTest() {
    @Test
    @TMSLink("C1")
    fun `User can register with filling all fields correctly`() {
        val customer: Customer = makeRandomInstance()

        RegistrationPage()
            .open()
            .register(customer).apply {
                h1Welcome.shouldHave(Condition.text("Welcome ${customer.user.username}"))
                pYourAccountWasCreated.shouldHave(
                    Condition.text(
                        "Your account was created successfully. " +
                                "You are now logged in."
                    )
                )
            }
    }

    @Test
    fun `User cannot register without filling required fields`() {
        RegistrationPage()
            .open().apply {
                inputRegister.click()

                spanCustomerFirstNameErrors.shouldHave(Condition.text("First name is required."))
                spanCustomerLastNameErrors.shouldHave(Condition.text("Last name is required."))
                spanCustomerAddressStreetErrors.shouldHave(Condition.text("Address is required."))
                spanCustomerAddressCityErrors.shouldHave(Condition.text("City is required."))
                spanCustomerAddressStateErrors.shouldHave(Condition.text("State is required."))
                spanCustomerAddressZipCode.shouldHave(Condition.text("Zip Code is required."))
                spanCustomerSnnErrors.shouldHave(Condition.text("Social Security Number is required."))
                spanCustomerUsernameErrors.shouldHave(Condition.text("Username is required."))
                spanCustomerPasswordErrors.shouldHave(Condition.text("Password is required."))
                spanRepeatedPasswordErrors.shouldHave(Condition.text("Password confirmation is required."))
            }
    }

    @Test
    fun `User can register without filling non-required fields`() {
        val customer: Customer = makeRandomInstance()
        customer.phoneNumber = ""

        RegistrationPage()
            .open()
            .register(customer).apply {
                h1Welcome.shouldHave(Condition.text("Welcome ${customer.user.username}"))
            }
    }
}