Feature: When I do a business tarnsaction of purchasing material worth of some amount

  Scenario: The first test of doing a purchase
    Given Purchase of material
    When I purchase of 15000 worth amount
    Then The discount I got was 0


  Scenario: The second test of doing a purchase
    Given Purchase of material
    When I purchase of 50000 worth amount
    Then The discount I got was 2500
    
    
  Scenario: The third test of doing a purchase
    Given Purchase of material
    When I purchase of 120000 worth amount
    Then The discount I got was 24000
    
    