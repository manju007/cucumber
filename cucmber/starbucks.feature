@star
Feature: Serve coffee 
	Coffee should not be served until paid for
    Coffee should not be served until the button has been pressed
    If there is no coffee left then money should be refunded

Scenario: Buy last coffee 
	Given there are 1 coffees left in the machine 
	And I have deposited 20$ 
	When I select 2 coffees 
	When I press the coffee button 
	Then I should be served 1 coffee 
	Then Machine should refund money 
	
Scenario: Buy last but one coffee 
	Given there are 2 coffees left in the machine 
	And I have deposited 0$ 
	When I select 1 coffees 
	When I press the coffee button 
	Then I should be served 0 coffee 
	And Only 2 Coffee should be left in the machine 	 
	And Machine should refund money 	
	
Scenario: Refund Money 
	Given there are 0 coffees left in the machine 
	And I have deposited 1$ 
	When I select 1 coffees 
	And I press the coffee button 
	Then I should be served 0 coffee 
	And Machine should refund money 
	
Scenario: Serve multiple coffees 
	Given there are 5 coffees left in the machine 
	And I have deposited 2$ 
	When I select 2 coffees 
	And I press the coffee button 
	Then I should be served 2 coffee 
	And Machine should refund money 
	
	