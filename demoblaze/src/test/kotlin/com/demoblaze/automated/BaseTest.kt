package com.demoblaze.automated

import com.codeborne.selenide.Configuration
import org.junit.jupiter.api.BeforeAll

open class BaseTest {
    companion object {
        @JvmStatic
        @BeforeAll
        fun setupSelenide(): Unit {
            Configuration.baseUrl = "https://www.demoblaze.com"
        }
    }
}