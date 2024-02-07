Feature: Login
  As a User,
  I want to see Login Functionality working as expected
  So that I can access product page in mobile app

  @positive-test
  Scenario: User Login with registered username and password
    Given User navigates to login page
    When User input valid username
    And User input valid password
    And User clicks Login button
    Then User should be navigate to product page

  @negative-test
  Scenario: User Login with invalid username and password
    Given User navigates to login page
    When User input invalid username
    And User input invalid password
    And User clicks Login button
    Then User can see error message "Username and password do not match any user in this service."

  @negative-test
  Scenario: User Login with username has been locked
    Given User navigates to login page
    When User input locked username
    And User input valid password
    And User clicks Login button
    Then User can see error message "Sorry, this user has been locked out."