package kz.abdukarimov.java.automation.qa.pages;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationPage {

//    private final String
    public AuthorizationPage openAuthorizationPage() {
        open("https://vk.com/");


//        click()
        return this;

    }
    public AuthorizationPage inputName(String name){

        return this;

    }

    public AuthorizationPage inputLastName(String lastName){

        return this;

    }


}
