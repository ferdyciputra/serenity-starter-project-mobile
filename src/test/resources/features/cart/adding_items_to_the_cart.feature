Feature: Adding items to the cart
  As a user I want to able to add product to the basket cart,
  So I can check out that products easily

  @positive-test
  Scenario: Add some items to the cart
    Given User is already on the product page
    When User adds the following items to the cart:
      | Sauce Labs Backpack   |
      | Sauce Labs Bike Light |
      | Sauce Labs Onesie     |
    Then The number of shopping carts must be equal to the items added

  @positive-test
  Scenario: Add one item to the cart and verification price in checkout page
    Given User is already on the product page
    When User add items "Sauce Labs Backpack" to the cart
    And User clicks icon cart
    Then The price displayed in checkout page should be same with price in product page

