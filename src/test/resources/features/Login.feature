Feature: Login
  Scenario:
  Scenario: valid admin login
    Given user navigates to lms application
    When user enters valid username and password
    And user clicks on login button
    Then user is successfully logged in

    Scenario: Logo and login text vilidation
      Given user navigates to lms application
      Then logo and login text is displayed
