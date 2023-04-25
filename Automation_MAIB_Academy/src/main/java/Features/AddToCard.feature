Feature: Add to card

  Scenario: User can add product in the card
    Given open the site
    When    fill in "Name" with "standard_user"
    And  fill in "Password" with "secret_sauce"
    And  click  "Login" button
    And user add the product in the cart
    Then appear next text "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office."
