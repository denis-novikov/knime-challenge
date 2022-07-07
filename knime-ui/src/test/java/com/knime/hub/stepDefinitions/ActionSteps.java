package com.knime.hub.stepDefinitions;

import io.cucumber.java.en.And;
import pages.SpaceEditorPage;
import widgets.CreateSpaceWidget;
import io.cucumber.java.en.When;


public class ActionSteps {

    @When("user click on public space button")
    public void userClickOnPublicSpaceButton() {
        new CreateSpaceWidget().createPublicSpace();
    }

    @And("click delete space")
    public void clickDeleteSpace() {
        new SpaceEditorPage().openFunctionsDropdown()
                .clickDeleteSpace();
    }

    @And("user delete space")
    public void userDeleteSpace() {
        new SpaceEditorPage().openFunctionsDropdown()
                .clickDeleteSpace()
                .confirmDeletion();
    }
}
