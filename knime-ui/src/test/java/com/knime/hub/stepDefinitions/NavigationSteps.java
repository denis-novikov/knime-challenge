package com.knime.hub.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.SpaceEditorPage;
import popups.DeletePopup;
import widgets.HeaderWidgets;


public class NavigationSteps {

    @Given("user is on landing page")
    public void userIsOnLandingPage() {
        new LandingPage();
    }

    @And("user is logging in")
    public void userIsLoggingIn() {
        new LandingPage().clickSignInBtn()
                .enterName()
                .enterPass()
                .submit();
    }

    @And("user navigates to Spaces page")
    public void userNavigatesToSpacesPage() {
        new HeaderWidgets().clickOnAvatar()
                .navigateTo("Spaces");
    }

    @When("user is in space editor page")
    public void userIsInSpaceEditorPage() {
        new SpaceEditorPage();
    }

    @Then("user is confirmation popup")
    public void userIsConfirmationPopup() {
        new DeletePopup();
    }
}
