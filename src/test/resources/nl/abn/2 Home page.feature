Feature: 2 Verify the home page after successful login of the 'abn' application

  Scenario: 2.1 Verify the navigation bar
    Given abn application is available
    And I login as valid user
    Then I see the navigation bar with the menus Home, Products and Contact
    And I logout the application