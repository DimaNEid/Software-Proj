Feature: view

  Scenario: The owner wants to view Residence list
    Given The owner chose view
    When The owner click view Resident
    Then Resident list is shown

  Scenario: The owner wants to view ResidentId list
    Given The owner chose view
    When The owner click view ResidentId
    Then ResidentID list is shown

  Scenario: The owner wants to view House list
    Given The owner chose view
    When The owner click view house
    Then house list is shown