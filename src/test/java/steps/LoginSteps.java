package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;
import pages.LoginPage;
import pages.ProductPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    ProductPage productPage;

    @Given("User navigates to login page")
    public void user_navigates_to_login_page() {
        loginPage.alreadyOnLoginPage();
    }

    @And("User input valid username")
    public void userEntersValidUserName() {
        loginPage.inputValidUsername();
    }

    @And("User input valid password")
    public void userEntersValidPassword() {
        loginPage.inputValidPassword();
    }

    @When("User clicks Login button")
    public void userClicksLoginButton() {
        loginPage.clickButtonLogin();
    }

    @Then("User should be navigate to product page")
    public void userShouldBeNavigateToProductPage() {
        Assert.assertTrue(productPage.isTitleProductDisplayed());
    }

    @When("User input locked username")
    public void userEntersLockedUserName() {
        loginPage.inputLockedUsername();
    }

    @Then("User can see error message {string}")
    public void userCanSeeErrorMessage(String expectedMessage) {
        Assert.assertEquals(expectedMessage, loginPage.getErrorMessage());
    }

    @When("User input invalid username")
    public void userEntersInvalidUserName() {
        loginPage.inputInvalidUsername();
    }

    @And("User input invalid password")
    public void userEntersInvalidPassword() {
        loginPage.inputInvalidPassword();
    }
}
