Feature: Add the product in the cart

  Scenario: Add the product in the cart
    When    fill in "Name" with "standard_user"
    And  fill in "Password" with "secret_sauce"
    And  click  "Login" button
    Then user add the product in the cart