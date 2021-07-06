
Feature: When I do a Business Transaction of purchasing worth of some amount

  Scenario: The first test case of doing a purchase
    Given: purchase of material
    When: I purchase 15000 worth of material
    Then: The discount I got was 0
  
  Scenario: The second test case of doing a purchase
    Given: purchase of material
    When: I purchase 50000 worth of material
    Then: The discount I got was 2500
   
   Scenario: The third test case of doing a purchase
    Given: purchase of material
    When: I purchase 200000 worth of material
    Then: The discount I got was 40000
  
    

	