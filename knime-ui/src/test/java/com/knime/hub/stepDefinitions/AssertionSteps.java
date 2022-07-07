package com.knime.hub.stepDefinitions;

import io.cucumber.java.en.Then;
import notifications.ToastMessages;
import pages.SpacesPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class AssertionSteps {

    @Then("new space created toast message is visible")
    public void newSpaceCreatedToastMessageIsVisible() {
        assertThat(new ToastMessages().getNotificationText(), containsString("new space was created"));
    }

    @Then("{string} is visible in users dashboard")
    public void newSpaceIsVisibleInUsersDashboard(String spaceName) {
        assertThat(new SpacesPage().getSpaceNames(), hasItem(spaceName));
    }

    @Then("space deleted toast message is visible")
    public void spaceDeletedToastMessageIsVisible() {
        assertThat(new ToastMessages().getNotificationText(), containsString("Space was deleted successfully!"));
    }

    @Then("{string} is not visible in users dashboard")
    public void spaceNotVisibleInUsersDashboard(String spaceName) {
        assertThat(new SpacesPage().getSpaceNames(), not(hasItem(spaceName)));
    }
}
