import com.codeborne.selenide.Condition
import com.codeborne.selenide.Configuration
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import ui.pages.TestPage

class TestPageTest {
    @Test
    fun `User can submit new answer`() {
        TestPage()
                .open()
                .apply {
                    emailField.sendKeys("test@test.com")
                    inputField.sendKeys("some input")
                    checkboxes.first().parent().parent().click()
                    radioButtons.first().parent().parent().click()
                    selectorDown.click()
                    selectMenuItems.last().parent().click()
                    textarea.sendKeys("textarea")

                    submit.click()

                    submittedForm.shouldHave(Condition.exactText("Form submitted successfully"))
                }
    }

    @Test
    fun `User cannot insert invalid email`() {
        TestPage()
                .open()
                .apply {
                    emailField.sendKeys("invalid")

                    submit.click()

                    errorMessage.shouldHave(Condition.text("E-mail address is not correct"))
                }
    }

    companion object {
        @JvmStatic
        @BeforeAll
        fun setup(): Unit {
            Configuration.timeout = 10
        }
    }
}