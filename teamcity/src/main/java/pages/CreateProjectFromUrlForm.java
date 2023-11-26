package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CreateProjectFromUrlForm extends Page {
    public SelenideElement projectNameLongField = $("input[id=\"projectName\"]");

    public SelenideElement buildTypeNameLongField = $("input[id=\"buildTypeName\"]");

    public SelenideElement textPropertyLongFieldValue = $("input[id=\"branch\"]");

    public SelenideElement refsHeadsExpandableMultilineProperty = $("textarea[id=\"teamcity:branchSpec\"]");
}
