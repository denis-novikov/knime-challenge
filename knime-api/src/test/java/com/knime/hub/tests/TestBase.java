package com.knime.hub.tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

import java.util.ResourceBundle;

import static io.restassured.RestAssured.oauth2;
import static java.util.ResourceBundle.getBundle;


public class TestBase {

    protected static ResourceBundle restApi = getBundle("restApi");

    @BeforeAll
    public static void beforeTests() {
        RestAssured.baseURI = restApi.getString("baseUrl");
        RestAssured.authentication = oauth2(restApi.getString("access_token"));
    }
}
