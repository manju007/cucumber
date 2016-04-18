@Zoo
Feature: Verifying the zoo website

Scenario: Check the page title for about us page
Given I am on the zoo website
When I click on the "ABOUT" page
Then I check the page title is "Selenium Framework | ABOUT"
And I close the browser

Scenario: Check the page title for shelters page
Given I am on the zoo website
When I click on the "FORUMS" page
Then I check the page title is "Selenium Framework | FORUMS"
And I close the browser