Feature: 1 Login 'abn' application with the valid and invalid users

  Scenario: 1.1 Login with an invalid user and verify that the user is not logged in

    Given abn application is available
    When I login as invalid user
    Then I still see the login page

  Scenario Outline: 1.2 Login with the valid user and verify that the user is logged in

    Given abn application is available
    When I login as a <valid_users>
    Then I see the home page
    And I logout the application

    Examples:

      | valid_users |
      | QA_USER1    |
      | QA_USER2    |
      | ADMIN_USER1 |
