package notifications;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;


public class ToastMessages {

    private static final By TOAST_NOTIFICATION = byClassName("banner");

    private static final By NOTIFICATION_TEXT = byClassName("message");

    public ToastMessages() {
        $(TOAST_NOTIFICATION).shouldBe(visible);
    }

    public String getNotificationText() {
        return $(NOTIFICATION_TEXT).getText();
    }
}
