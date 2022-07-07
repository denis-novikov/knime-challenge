package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;


public class SignInPage {

    private static final By SIGN_IN_PAGE = byClassName("page-user-login");

    private static final By USERNAME = byId("edit-name");

    private static final By PASSWORD = byId("edit-pass");

    private static final By SUBMIT_BTN = byId("edit-submit");

    public SignInPage() {
        $(SIGN_IN_PAGE).shouldBe(visible);
    }

    @Step
    public SignInPage enterName() {
        $(USERNAME).setValue("denovy");
        return this;
    }

    @Step
    public SignInPage enterPass() {
        $(PASSWORD).setValue("xlsqbq123");
        return this;
    }

    @Step
    public void submit() {
        $(SUBMIT_BTN).click();
    }

}
