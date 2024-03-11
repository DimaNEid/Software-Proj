Feature: addResidenceInfo

  Scenario: Add Residence Details
    Given The owner is logged in
    When The owner enters ResidentId "50", ownerId "333", location "wall street", numOfFloors 5 , services "water", numOfHouses 10
    Then The data is added