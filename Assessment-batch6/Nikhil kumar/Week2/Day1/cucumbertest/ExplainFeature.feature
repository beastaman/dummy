Feature: I do a buisness transaction of purchasing material worth of some amount

  Scenario: The first test case of doing a purchase
    Given Purchase of material
    When I purchase of 15000 worth amount
    Then The discount i got was 0

  Scenario: The second test case of doing a purchase
    Given Purchase of material
    When I purchase of 50000 worth amount
    Then The discount i got was 2500

  Scenario: The third test case of doing a purchase
    Given Purchase of material
    When I purchase of 120000 worth amount
    Then The discount i got was 24000
