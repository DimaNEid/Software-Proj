Feature: signUp

  Scenario: Successful user registration
    Given The user is on the registration page
    When The user enters a username "<Omar>" and password "<562>"
    Then  user signed up

  Scenario: User registration fails
    Given The user is on the registration page
    When user enters  "<dimaEid>" and "<123>"
    Then user connot sign up
