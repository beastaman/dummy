Feature: When I do a business transaction of purchasing material worth of some amount


  Scenario: The first test case of doing a purchase
    Given Purchase of material
    When I purchase of 15000 worth amount
    Then Discount I got is 0
    
	Scenario: The first test case of doing a purchase
    Given Purchase of material
    When I purchase of 50000 worth amount
    Then Discount I got is 2500
    
	Scenario: The first test case of doing a purchase
    Given Purchase of material
    When I purchase of 110000 worth amount
    Then Discount I got is 11000
    

