package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ProjectPage extends Page {
    private SelenideElement createProjectLink = $(byText("Create project"));

    private SelenideElement urlLongField = $("input[id=\"url\"]");

    private SelenideElement createProjectFromUrlPrimary = $(byName("createProjectFromUrl"));


    public ProjectPage() {
        super();
    }

    public CreateProjectFromUrlForm createProject(String repositoryUrl) {
        createProjectLink.click();
        urlLongField.sendKeys(repositoryUrl);
        createProjectFromUrlPrimary.click();
        waitPageLoading();
        return new CreateProjectFromUrlForm();
    }
}
