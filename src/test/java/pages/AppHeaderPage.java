package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AppHeaderPage extends PageObject {

    @AndroidFindBy(accessibility = "test-Cart")
    WebElement iconCart;

    public Integer getCountCart() {
        By selectorCountCart = By.xpath("//android.view.ViewGroup/android.widget.TextView");
        WebElement elementCountCart = iconCart.findElement(selectorCountCart);
        waitFor(elementCountCart);
        return Integer.parseInt(elementCountCart.getText());
    }

    public void clickIconCart(){
        waitFor(ExpectedConditions.elementToBeClickable(iconCart));
        clickOn(iconCart);
    }
}
