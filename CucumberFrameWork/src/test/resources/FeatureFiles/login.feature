Feature: Testing the login feature of actitime application
Scenario: testing the login feature with valid data
Given  the browser is launched
And the aplication is loaded
When the user enters the valid username 
And the user enters the valid password 
And the user clicks on the login button
Then dashboard should be displayed