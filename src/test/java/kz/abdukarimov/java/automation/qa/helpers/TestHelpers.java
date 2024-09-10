package kz.abdukarimov.java.automation.qa.helpers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import kz.abdukarimov.java.automation.qa.pages.AuthorizationPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestHelpers {

    public AuthorizationPage authorizationPage = new AuthorizationPage();


    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    public void tearDown() {
        Selenide.sleep(10000);
        Selenide.closeWebDriver();
    }
}
