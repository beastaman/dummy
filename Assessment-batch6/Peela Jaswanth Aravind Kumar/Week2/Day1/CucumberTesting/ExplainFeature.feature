
Feature: When I do a business transaction of purchasing a product with some money
  I want to use this template for my feature file

  Scenario: First test of doing a purchase
    Given purchase of material
    When I purchase of material of worth 15000
    Then the discount I got was 0
	
	Scenario: First test of doing a purchase
    Given purchase of material
    When I purchase of material of worth 50000
    Then the discount I got was 2500
   Scenario: First test of doing a purchase
    Given purchase of material
    When I purchase of material of worth 100000
    Then the discount I got was 20000
  
