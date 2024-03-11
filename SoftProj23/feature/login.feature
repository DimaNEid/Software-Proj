Feature: Login
  The user wants to access his personal account


  Scenario: user logged in successfully
    Given  the user is not logged in
    When  The user has entered the data correctly  "dimaEid" and "123"
    Then the user is logged in


  Scenario: user cannot login
    Given the user is not logged in
    When username is "<dimaEid>" and password is "<wrongpassword>"
    Then the user login fails




