Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct
  credentials to different accounts

  Background: Assuming user is on the login page
    Given user is on the login page


  Scenario: Login as librarian
    Given user is on the login page
    When user enters librarian username
    And user enters librarian password
    Then user can see the dashboard
    And  user click dropdown
    Then user logout dashboard


  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see the dashboard