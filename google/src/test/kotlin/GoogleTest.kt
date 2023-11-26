import com.codeborne.selenide.Selenide
import org.junit.jupiter.api.Test
import ui.GooglePage

class GoogleTest {
    @Test
    fun `Basic google test`() {
        val key = "qa"

        Selenide.open("https://google.com")

        GooglePage()
            .acceptCookies()
            .search(key)
            .checkTitle(key)
    }
}
