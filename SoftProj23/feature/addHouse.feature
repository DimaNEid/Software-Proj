Feature: addHouse

  Scenario: The owner logged to the control panel
    Given  The owner wants to add House
    When The owner enters House_id "501", Resident_Id "50", floor_Id "2",monthlyRent "600" , balcony "western" , bathrooms 2 , bedrooms 6
    Then House added