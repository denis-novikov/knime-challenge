package com.knime.hub.tests;

import helpers.Client;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


@Epic("Spaces")
@Feature("Create New Space")
public class CreateNewSpaceTest extends TestBase {

    private static final String NEW_SPACE_NAME = "Test space";

    @Test
    public void createSpaceSuccess() {
        Response response = new Client().makePutRequest(format(restApi.getString("createSpaceUri"), NEW_SPACE_NAME));
        assertThat(response.getStatusCode(), equalTo(201));
    }

    @Test
    public void deleteSpaceSuccess() {
        Response response = new Client().makeDeleteRequest(format(restApi.getString("deleteSpaceUri"), NEW_SPACE_NAME));
        assertThat(response.getStatusCode(), equalTo(204));
    }
}
