package pages;

import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;


public class SpacesPage {

    private static final By SPACES_LIST = byClassName("space-list");

    private static final By SPACE_NAME = byClassName("title");

    public SpacesPage() {
        $(SPACES_LIST).shouldBe(visible);
    }

    public List<String> getSpaceNames() {
        return $(SPACES_LIST).$$(SPACE_NAME)
                .texts();
    }

}
