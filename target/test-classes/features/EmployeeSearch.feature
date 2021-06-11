Feature: Employee Search
 Background:
  And user is logged in with valid admin credentials
  And user navigates to employee list page

  @smoke
  Scenario: Search employee By id
   // Given user navigates to hrms
    And user enters valid employee id
    And click on search button
    Then user see employee information is displayed

    @smoke
  Scenario: Search employee By name
   // Given user navigates to hrms   //We have this step in Hooks
    // And user is logged in with valid admin credentials   //these repeated steps we have in background which is applicable to all
    // And user navigates to employee list page
    And user enters valid employee name
    And click on search button
    Then user see employee information is displayed
