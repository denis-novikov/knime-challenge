package widgets;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import dropdownmenus.AvatarDropdownMenu;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.$;


public class HeaderWidgets {

    private static final By HEADER = byTagName("header");

    private static final By AVATAR_BTN = byClassName("avatar");

    public HeaderWidgets() {
        $(HEADER).shouldBe(visible);
    }

    @Step
    public AvatarDropdownMenu clickOnAvatar() {
        $(AVATAR_BTN).click();
        return new AvatarDropdownMenu();
    }
}
