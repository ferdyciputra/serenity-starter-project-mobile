package pages;

import net.serenitybdd.core.pages.PageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.PropertiesReader;

public class LoginPage extends PageObject {

    @AndroidFindBy(accessibility = "test-Password")
    WebElement password;

    @AndroidFindBy(accessibility = "test-LOGIN")
    WebElement loginBtn;

    @AndroidFindBy(accessibility = "test-Username")
    WebElement userName;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
    WebElement errorMessage;

    public void inputValidUsername() {
        waitFor(ExpectedConditions.visibilityOf(userName));
        typeInto(userName, PropertiesReader.getValidUser());
    }

    public void inputValidPassword() {
        waitFor(ExpectedConditions.visibilityOf(password));
        typeInto(password, PropertiesReader.getValidPassword());
    }

    public void clickButtonLogin() {
        waitFor(ExpectedConditions.elementToBeClickable(loginBtn));
        clickOn(loginBtn);
    }

    public void alreadyOnLoginPage() {
        waitFor(userName);
    }

    public void inputLockedUsername() {
        waitFor(ExpectedConditions.visibilityOf(userName));
        typeInto(userName, PropertiesReader.getLockedUser());
    }

    public void inputInvalidUsername() {
        waitFor(ExpectedConditions.visibilityOf(userName));
        typeInto(userName, PropertiesReader.getInvalidUser());
    }

    public void inputInvalidPassword() {
        waitFor(ExpectedConditions.visibilityOf(password));
        typeInto(password, PropertiesReader.getInvalidPassword());
    }

    public String getErrorMessage(){
        waitFor(ExpectedConditions.visibilityOf(errorMessage));
        return errorMessage.getText();
    }

}
