Feature: addUser

  Scenario: the user wants to add his info
    Given  The user created an account
    When   The user provides "<username>" and "<password>"
    Then   The user Information are added