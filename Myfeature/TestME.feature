Feature: DemoWebShop Validations
Scenario: Guest user registration in DemoWebShop
Given User launches the DemoWebShop App
Then User clicks on SignIn button
And User provides the valid data for all the fields
When User clciks in submit button at the end of the form
Then Verifies the result for registration
And Prints the message

Scenario: Registered user login in DemoWebShop
Given Applicatiion launched by registered user
Then User access the Login link
And Provides the valid data as input
And Verifies the login status