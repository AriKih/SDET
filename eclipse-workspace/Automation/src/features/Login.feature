Feature: My Practice

Scenario: UserRegister access to the store doing login
Given the user is on the landing page
When he press signin
Then user entered the credentials
Then will have access


Scenario: user buy something
Given the user is on the landing page
When the user enters dresses in the search bar
And the user clicks the search button
Then the dresses page appears
Then the add to his car
And the user pay the dress

Scenario: User Sing Out the session
Given the user is on the landing page
When user sing out
Then User can not buy nothing

Scenario: new user creates an account
Given the user is on the landing page
When he press signin
Then create an account

