Feature: Executing with Cucumber options 

Scenario: Login to application with Cucumber options
Given Launch the browser
When Open the application with url
Then Login with Single User
Then CRM homepage displayed for single user
Then click on Contact tab
And Quit the browser
