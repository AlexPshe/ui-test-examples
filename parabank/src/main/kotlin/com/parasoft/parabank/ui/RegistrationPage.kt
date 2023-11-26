package com.parasoft.parabank.ui

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.Selenide.element
import com.parasoft.parabank.models.Customer

// page_url = https://parabank.parasoft.com/parabank/register.html
class RegistrationPage {
    private val inputCustomerFirstName = element("input[id='customer.firstName']")

    private val inputCustomerLastName = element("input[id='customer.lastName']")

    private val inputCustomerAddressStreet = element("input[id='customer.address.street']")

    private val inputCustomerAddressCity = element("input[id='customer.address.city']")

    private val inputCustomerAddressState = element("input[id='customer.address.state']")

    private val inputCustomerAddressZipCode = element("input[id='customer.address.zipCode']")

    private val inputCustomerPhoneNumber = element("input[id='customer.phoneNumber']")

    private val inputCustomerSsn = element("input[id='customer.ssn']")

    private val inputCustomerUsername = element("input[id='customer.username']")

    private val inputCustomerPassword = element("input[id='customer.password']")

    private val inputRepeatedPassword = element("input[id='repeatedPassword']")

    val inputRegister = element("input[value='Register']")

    val h1Welcome = element("h1[class='title']")

    val pYourAccountWasCreated = element("div[id='rightPanel'] p")

    val spanCustomerFirstNameErrors = element("span[id='customer.firstName.errors']")

    val spanCustomerLastNameErrors = element("span[id='customer.lastName.errors']")

    val inputCustomerAddressStreet2 = element("input[id='customer.address.street']")

    val spanCustomerAddressStreetErrors = element("span[id='customer.address.street.errors']")

    val spanCustomerAddressCityErrors = element("span[id='customer.address.city.errors']")

    val spanCustomerAddressStateErrors = element("span[id='customer.address.state.errors']")

    val spanCustomerAddressZipCode = element("span[id='customer.address.zipCode.errors']")

    val spanCustomerSnnErrors = element("span[id='customer.ssn.errors']")

    val spanCustomerUsernameErrors = element("span[id='customer.username.errors']")

    val spanCustomerPasswordErrors = element("span[id='customer.password.errors']")

    val spanRepeatedPasswordErrors = element("span[id='repeatedPassword.errors']")

    fun open() = apply {
        Selenide.open("/parabank/register.htm")
    }

    fun register(customer: Customer) = apply {
        inputCustomerFirstName.sendKeys(customer.name.firstName)
        inputCustomerLastName.sendKeys(customer.name.lastName)
        inputCustomerAddressStreet.sendKeys(customer.address.street)
        inputCustomerAddressCity.sendKeys(customer.address.city)
        inputCustomerAddressState.sendKeys(customer.address.state)
        inputCustomerAddressZipCode.sendKeys(customer.address.zipcode)
        inputCustomerPhoneNumber.sendKeys(customer.phoneNumber)
        inputCustomerPhoneNumber.sendKeys(customer.phoneNumber)
        inputCustomerSsn.sendKeys(customer.ssn)
        inputCustomerUsername.sendKeys(customer.user.username)
        inputCustomerPassword.sendKeys(customer.user.password)
        inputRepeatedPassword.sendKeys(customer.user.password)
        inputRegister.click()
    }
}