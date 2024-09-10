package kz.abdukarimov.java.automation.qa.rest_assured;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;

public class Config {
    public static RequestSpecification request = with()
        .baseUri("http://localhost:8080")
        .basePath("/api")
        .header("Content-Type", "application/json")
        .log().all();


    public static ResponseSpecification responseSec = new ResponseSpecBuilder()
        .expectStatusCode(200)
        .build();
}