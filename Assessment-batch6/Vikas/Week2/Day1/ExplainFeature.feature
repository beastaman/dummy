Feature: when i do a business transaction of purchasing material worth of some amount

  Scenario: The first test case of doing a purchase
		Given Purchase of material 
		When I purchase of 13000 worth amount
		Then The discount i got was 0
		
  Scenario: The second test case of doing a purchase
		Given Purchase of material 
		When I purchase of 50000 worth amount
		Then The discount i got was 100
		
  Scenario: The third test case of doing a purchase
		Given Purchase of material 
		When I purchase of 120000 worth amount
		Then The discount i got was 6000