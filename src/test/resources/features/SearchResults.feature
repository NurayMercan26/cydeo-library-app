Feature: Check "Users" page as a librarian user

  Scenario: Table columns names
    Given librarian is on the login page
    When librarian enters username "librarian1@library"
    And librarian  enter password "qU9mrvur"
    And click sign in button
    And  user click users page button
    Then table should have following columns
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |


