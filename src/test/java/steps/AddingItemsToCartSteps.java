package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;
import pages.AppHeaderPage;
import pages.CheckoutPage;
import pages.ProductPage;

import java.util.List;

public class AddingItemsToCartSteps {

    @Steps
    ProductPage productPage;

    @Steps
    AppHeaderPage appHeaderPage;

    @Steps
    CheckoutPage checkoutPage;

    List<String> itemNames;
    Double expectedPrice;

    @When("User adds the following items to the cart:")
    public void userAddsTheFollowingItemsToTheCart(List<String> itemNames) {
        this.itemNames = itemNames;
        itemNames.forEach(
                itemName -> productPage.addToCart(itemName)
        );
    }

    @Then("The number of shopping carts must be equal to the items added")
    public void theNumberOfShoppingCartsMustBeEqualToTheItemsAdded() {
        Integer totalItemAdded = itemNames.size();
        Assert.assertEquals(totalItemAdded, appHeaderPage.getCountCart());
    }

    @When("User add items {string} to the cart")
    public void userAddItemsToTheCart(String itemName) {
        productPage.addToCart(itemName);
        expectedPrice = productPage.getPriceByTitleItemName(itemName);
    }

    @And("User clicks icon cart")
    public void userClicksIconCart() {
        appHeaderPage.clickIconCart();
    }

    @Then("The price displayed in checkout page should be same with price in product page")
    public void thePriceDisplayedInCheckoutPageShouldBeSameWithPriceInProductPage() {
        Double actualPrice = checkoutPage.getPriceItem();

        Assert.assertEquals(expectedPrice, actualPrice);
    }
}
