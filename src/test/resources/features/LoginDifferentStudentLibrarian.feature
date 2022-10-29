Feature:  Login feature

  Background: User should go to the login page


@wip
  Scenario Outline:User should be able to login with valid credentials as a student
    Given user enter on the login page
    When student enters username "<username>"
    And student enters password "<password>"
    And student clicks sign in button
   And librarian user should be able to see dashboard "<account name>"
    Then student logout

    Examples: Valid credentials for student user

      | username          | password | account name    |
      | student20@library | nGdNzH1e | Test Student 20 |
      | student21@library | y5pYTlqY | Test Student 21 |
      | student22@library | 2eMI9Uyk | Test Student 22 |
      | student23@library | zzTYIurO | Test Student 23 |
      | student24@library | OwsiR4u5 | Test Student 24 |


@wip
  Scenario Outline: User should be able to login with valid credentials as a librarian
    Given users is  enter on the login page
    When librarian is enter username "<username>"
    And librarian is  enter password "<password>"
    And librarian is click sign in button
    And librarian user should be able to see dashboard "<account name>"
    Then librarian logout


    Examples: Valid credentials for librarian user
      | username            | password | account name      |
      | librarian11@library | fsRRgXxB | Test Librarian 11 |
      | librarian12@library | wHhJQDSK | Test Librarian 12 |
      | librarian13@library | YCJCbmU3 | Test Librarian 13 |
      | librarian14@library | bWN7YaaB | Test Librarian 14 |
      | librarian15@library | YLu0ZIMj | Test Librarian 15 |
