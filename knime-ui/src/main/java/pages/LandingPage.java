package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;


public class LandingPage {

    private static final By LANDING_PAGE = byId("__nuxt");

    private static final By SIGN_IN_BTN = byClassName("login");


    public LandingPage() {
        $(LANDING_PAGE).shouldBe(visible);
    }

    @Step
    public SignInPage clickSignInBtn() {
        $(SIGN_IN_BTN).click();
        return new SignInPage();
    }
}
