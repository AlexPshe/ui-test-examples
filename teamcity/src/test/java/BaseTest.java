import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    protected static final String serverUrl = "http://localhost:8111";

    @BeforeAll
    public static void setup() {
        Configuration.baseUrl = serverUrl;
    }
}
