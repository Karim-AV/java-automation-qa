package kz.abdukarimov.java.automation.qa.rest_assured;
import io.restassured.http.ContentType;
import kz.abdukarimov.java.automation.qa.rest_assured.lombok.LoginBodyLobokModel;
import kz.abdukarimov.java.automation.qa.rest_assured.lombok.LoginResponceLobokModel;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CheckLogsRATest {

    @Test
     public void checkLogs(){

        LoginBodyLobokModel loginBody = new LoginBodyLobokModel();
        loginBody.setEmail("karimabdukarimov2000@gmail.com");
//        loginBody.setPassword("QwertYXrtfY2002");

        LoginResponceLobokModel response = given()
                .log().uri()
                .body(loginBody)
                .contentType(ContentType.JSON)
            .when()
                .post("https://vk.com/")
            .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().as(LoginResponceLobokModel.class);

        assertThat(response).isEqualTo("karimabdukarimov2000@gmail.com");
    }
}
