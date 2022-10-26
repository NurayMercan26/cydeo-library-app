Feature: Library app login feature
  User Story:
  As a user, I should be able to login with
  correct credentials to different accounts

  Background: Assuming user is on the login page

  @librarian @employee
  Scenario: Login as librarian
    Given user can on the login page
    When user enter librarian username
    And user enter librarian password
    And user have to click button
    And  user clicks dropdown
    And user can logout dashboard
    Then user  sees the dashboard

  @student
  Scenario: Login as student
    When user enter student username
    And user enter student password
    And  user  must click button
    Then user should see the dashboard