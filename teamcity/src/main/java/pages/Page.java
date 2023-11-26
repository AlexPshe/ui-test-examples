package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public abstract class Page {
    private SelenideElement saving = $("#saving");

    public void waitPageLoading() {
        saving.shouldNotBe(Condition.visible);
    }
}
