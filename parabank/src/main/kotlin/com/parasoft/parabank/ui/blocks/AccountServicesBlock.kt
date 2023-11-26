package com.parasoft.parabank.ui.blocks

import com.codeborne.selenide.Selenide.element

class AccountServicesBlock {
    val linkOpenNewAccount =
        element("html > body > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > ul > li:nth-of-type(1) > a")

    val linkAccountsOverview =
        element("html > body > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > ul > li:nth-of-type(2) > a")

    val linkTransferFunds =
        element("html > body > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > ul > li:nth-of-type(3) > a")

    val linkBillPay =
        element("html > body > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > ul > li:nth-of-type(4) > a")

    val linkFindTransactions =
        element("html > body > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > ul > li:nth-of-type(5) > a")

    val linkUpdateContactInfo =
        element("html > body > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > ul > li:nth-of-type(6) > a")

    val linkRequestLoan =
        element("html > body > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > ul > li:nth-of-type(7) > a")

    val linkLogOut =
        element("html > body > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > ul > li:nth-of-type(8) > a")
}