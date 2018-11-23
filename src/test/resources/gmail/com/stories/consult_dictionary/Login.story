Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Success login
Given the user 'testantonastound@gmail.com' with password '12Test*34' is on main github page
When the user logged in to email
Then amount of emails should be printed
