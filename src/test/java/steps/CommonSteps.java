package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;
import pages.LoginPage;

public class CommonSteps {
    @Steps
    LoginPage loginPage;

    @Given("User is already on the product page")
    public void user_is_already_on_the_product_page() {
        loginPage.alreadyOnLoginPage();
        loginPage.inputValidUsername();
        loginPage.inputValidPassword();
        loginPage.clickButtonLogin();
    }
}
