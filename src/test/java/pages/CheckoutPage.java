package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends PageObject {

    @AndroidFindBy(accessibility = "test-Cart Content")
    WebElement elementCartContent;

    public Double getPriceItem(){
        waitFor(elementCartContent);
        By selectorPriceItem = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Price\"]/android.widget.TextView");
        WebElement elementPriceItem = elementCartContent.findElement(selectorPriceItem);

        return Double.valueOf(elementPriceItem.getText().replace("$", ""));
    }
}
