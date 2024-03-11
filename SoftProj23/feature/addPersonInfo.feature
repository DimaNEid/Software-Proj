Feature: addPersonInfo

  Scenario: The user in main page
    Given user chose to add his information
    When  owner adds his information
    Then  owner info are added
    When  tenant adds his information
    Then  tenant info are added
    When  admin adds his information
    Then  admin info are added
