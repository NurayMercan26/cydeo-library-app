
Feature: Login feature
  As a user, should be able to login with valid credentials
  Student and Librarian

  Background: User should go to the login page
@wip
  Scenario: User should be able to login with valid credentials as a librarian
    Given user go to  on the login page
    When librarian enter username "librarian60@library"
    And librarian enter password "Lj5VU4Tq"
    And librarian click sign in button
    And librarian should be able see "1251" users
    And  librarian click dropdown
    Then librarian is logout


@wip
  Scenario: User should be able to login with valid credentials as a student
    When student enter username "student55@library"
    And student enter password "xBLy3ufr"
    And student click sign in button
    Then student should be see homepage


