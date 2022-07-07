package pages;

import com.codeborne.selenide.Condition;
import dropdownmenus.SpaceFunctionsDropdown;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;


public class SpaceEditorPage {

    private static final By FUNCTIONS_BTN = byClassName("function-button");

    public SpaceEditorPage() {
        $("main").shouldHave(Condition.attribute("data-v-50cc6438"));
    }

    public SpaceFunctionsDropdown openFunctionsDropdown() {
        $(FUNCTIONS_BTN).click();
        return new SpaceFunctionsDropdown();
    }
}
