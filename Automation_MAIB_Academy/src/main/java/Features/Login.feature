Feature: Login

  Scenario: login with valid credentials
    When    fill in "Name" with "standard_user"
    And  fill in "Password" with "secret_sauce"
    And  click  "Login" button

