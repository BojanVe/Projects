Feature: Search bar

  Scenario: User searches a product
  
    Given User is successfully logged
    When User clicks on the search bar
    And Enters a product name
    And Clicks on the search icon
    Then The products that contain that keyword are displayed
