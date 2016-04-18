Feature: Pizza Hut 
	Pizza should be delivered to the users address provided 
    Pizza should not be handed over till the user pays
    Return the change if money is more than pizza prize

Scenario: Prepare Pizza 
	Given customer calls the pizza shop 
	When customer orders for the pizza	
	Then I should prepare pizza
	