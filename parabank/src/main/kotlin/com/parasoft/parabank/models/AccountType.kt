package com.parasoft.parabank.models

enum class AccountType(val value: String) {
    CHECKING("CHECKING"),
    SAVINGS("SAVINGS")
}

const val DEFAULT = "default"
