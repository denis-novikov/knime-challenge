package helpers;

import io.restassured.response.Response;

import static io.restassured.RestAssured.when;


public class Client {

    public Response makePutRequest(String url) {
        return when().put(url)
                .then()
                .extract()
                .response();
    }

    public Response makeDeleteRequest(String url) {
        return when().put(url)
                .then()
                .extract()
                .response();
    }

}

