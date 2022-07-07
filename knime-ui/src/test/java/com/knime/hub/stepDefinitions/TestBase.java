package com.knime.hub.stepDefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;

import java.util.ResourceBundle;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class TestBase {

    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("configuration");

    @Before
    public static void setUp() {
        clearBrowserCookies();
        closeWebDriver();

        Configuration.baseUrl = resourceBundle.getString("baseUrl");
        Configuration.timeout = Long.parseLong(resourceBundle.getString("implicitWaitMillis"));
        Configuration.browserSize = resourceBundle.getString("browserSize");

        open("/");

        $(byText("Accept and close")).shouldBe(visible)
                .click();
    }
}
