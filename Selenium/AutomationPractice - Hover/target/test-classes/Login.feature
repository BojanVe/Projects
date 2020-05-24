Feature: Log in functionality

  Scenario: Log in with valid credentials
    Given I am on home page
    When I click on Log In button
    And I enter "bojan.velevski@yahoo.com" in email
    And I enter "testing123" in password
    Then I am successfully logged in
    Then I click Log Out button
    And I am logged out
    And The browser can be closed
