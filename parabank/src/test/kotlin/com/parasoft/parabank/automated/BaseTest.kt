package com.parasoft.parabank.automated

import com.codeborne.selenide.Configuration
import org.junit.jupiter.api.BeforeAll

open class BaseTest {
    companion object {
        @JvmStatic
        @BeforeAll
        fun selenideSetup(): Unit {
            Configuration.baseUrl = "https://parabank.parasoft.com"
            Configuration.timeout = 10_000
        }
    }
}