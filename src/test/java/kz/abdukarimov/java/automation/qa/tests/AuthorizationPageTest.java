package kz.abdukarimov.java.automation.qa.tests;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import kz.abdukarimov.java.automation.qa.helpers.TestHelpers;
import kz.abdukarimov.java.automation.qa.pages.AuthorizationPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AuthorizationPageTest extends TestHelpers {

    @Test
    void testAuthorizationPage() {

        authorizationPage.openAuthorizationPage();

    }



}
