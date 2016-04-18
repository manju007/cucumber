Feature: Login to Google

Scenario: Successful login
  Given a user "manju" with password "vaibhav"
  And I am on the login page
  And I fill in "User name" with "manju"
  And I fill in "Password" with "vaibhav"
  When I press "Log in"
  Then I should see "Welcome, Manju"