package popups;

import org.openqa.selenium.By;
import pages.SpacesPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class DeletePopup {

    private static final By DELETE_POPUP = byClassName("warn");

    private static final By CONFIRMATION_TEXT = byClassName("confirmation");

    private static final By CONFIRMATION_INPUT = byId("confirmationForm");

    public DeletePopup() {
        $(DELETE_POPUP).shouldBe(visible);
    }

    public SpacesPage confirmDeletion() {
        $(CONFIRMATION_INPUT).setValue(getSpaceName())
                .submit();
        return new SpacesPage();
    }

    private String getSpaceName() {
        return $(CONFIRMATION_TEXT).$(byTagName("strong")).text();
    }
}
