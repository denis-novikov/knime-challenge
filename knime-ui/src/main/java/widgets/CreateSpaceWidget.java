package widgets;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.SpaceEditorPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class CreateSpaceWidget {

    private static final By CREATE_SPACE_WIDGET = byClassName("create-space-card");

    public CreateSpaceWidget() {
        $(CREATE_SPACE_WIDGET).shouldBe(visible);
    }

    @Step
    public SpaceEditorPage createPublicSpace() {
        $(CREATE_SPACE_WIDGET).$(byText("Public space"))
                .click();
        return new SpaceEditorPage();
    }

}
