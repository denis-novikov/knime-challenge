package dropdownmenus;

import org.openqa.selenium.By;
import popups.DeletePopup;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class SpaceFunctionsDropdown {

    private static final By DROPDOWN_MENU = byClassName("content");

    public SpaceFunctionsDropdown() {
        $(DROPDOWN_MENU).shouldBe(visible);
    }

    public DeletePopup clickDeleteSpace() {
        $(byText("Delete space")).click();
        return new DeletePopup();
    }

}
