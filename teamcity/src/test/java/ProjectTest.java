import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.ProjectPage;

public class ProjectTest extends BaseTest {
    @Test
    public void createProjectTest() {
        Selenide.open("");

        new LoginPage().login("admin", "admin", true);
        var createProjectForm = new ProjectPage().createProject("https://github.com/AlexPshe/spring-core-for-qa");

        createProjectForm.projectNameLongField.shouldHave(Condition.exactValue("Spring Core For Qa"));
        createProjectForm.buildTypeNameLongField.shouldHave(Condition.exactValue("Build"));
        createProjectForm.textPropertyLongFieldValue.shouldHave(Condition.exactValue("refs/heads/master"));
        createProjectForm.refsHeadsExpandableMultilineProperty.shouldHave(Condition.exactValue("refs/heads/*"));
    }
}
