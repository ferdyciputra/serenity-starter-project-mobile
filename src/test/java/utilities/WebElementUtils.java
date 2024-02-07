package utilities;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public class WebElementUtils extends PageObject {

    public void scrollToText(WebDriver driver, String text) {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable("
                + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().text(\"" + text + "\"));"));
    }
}
