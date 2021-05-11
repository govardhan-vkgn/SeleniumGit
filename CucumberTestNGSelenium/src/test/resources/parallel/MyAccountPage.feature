Feature: Account page feature

Background:
Given user has already logged in to application
|	username	|	password	|
|	govardhan.vkgn@gmail.com	|	Jaya@143	|

Scenario: Accounts page title
Given user is on accounts page
When user gets title of the page
Then page title should be "My account - My Store"

Scenario: Accounts section count
Given user is on accounts page
Then user gets accounts section 
|	ORDER HISTORY AND DETAILS |
|	MY CREDIT SLIPS	|
|	MY ADDRESSES	|
|	MY PERSONAL INFORMATION	|
|	MY WISHLISTS	|
And accounts section should be 4