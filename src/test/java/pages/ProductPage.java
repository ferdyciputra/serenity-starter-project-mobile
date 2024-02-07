package pages;

import net.serenitybdd.core.exceptions.NoSuchElementException;
import net.serenitybdd.core.pages.PageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.WebElementUtils;

public class ProductPage extends PageObject {
    private final WebElementUtils webElementUtils = new WebElementUtils();

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PRODUCTS\"]")
    WebElement elementTitleProduct;

    public Boolean isTitleProductDisplayed() {
        waitFor(elementTitleProduct);

        try {
            return elementTitleProduct.isDisplayed();
        } catch (NoSuchElementException exception) {
            return false;
        }
    }

    public void addToCart(String itemName) {
        webElementUtils.scrollToText(getDriver(), itemName);
        String fullXpath = getXpathByTitleItemName(itemName) + "/following-sibling::android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"]";
        WebElement elementItemAddToCart = getDriver().findElement(By.xpath(fullXpath));
        clickOn(elementItemAddToCart);
    }

    private String getXpathByTitleItemName(String itemName) {
        return "//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"" + itemName + "\"]";
    }

    public Double getPriceByTitleItemName(String itemName) {
        webElementUtils.scrollToText(getDriver(), itemName);
        String fullXpath = getXpathByTitleItemName(itemName) + "/following-sibling::android.widget.TextView[@content-desc=\"test-Price\"]";
        WebElement elementPriceItem = getDriver().findElement(By.xpath(fullXpath));

        return Double.valueOf(elementPriceItem.getText().replace("$", ""));
    }
}
