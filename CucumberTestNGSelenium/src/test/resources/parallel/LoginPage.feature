
Feature: Login Page Feature

Scenario: Login Page Title
Given user is on Login page
When user gets title of the page
Then page title should be "Login - My Store"

Scenario: Forgot Password Link
Given user is on Login page
Then forgot your password link should be displayed

Scenario: Login with correct credentials
Given user is on Login page
When user enters username "govardhan.vkgn@gmail.com"
And user enters password "Jaya@143"
And user clicks on login button
Then user gets title of the page
And page title should be "My account - My Store"
