package dropdownmenus;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class AvatarDropdownMenu {

    private static final By AVATAR_DROPDOWN = byXpath("//*[@class='menu-wrapper expanded']");

    public AvatarDropdownMenu() {
        $(AVATAR_DROPDOWN).shouldBe(visible);
    }

    public void navigateTo(String menuOption) {
        $(byText(menuOption)).click();
    }
}
