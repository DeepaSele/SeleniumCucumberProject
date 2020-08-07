Feature: CRM Application smoke test

Scenario: Login to application
Given Launch the browser
When Open the application with url
Then Login with Single User
Then CRM homepage displayed for single user
Then click on Contact tab
And Quit the browser
 

#WITHOUT EXAMPLES
#Feature: CRM Application smoke test

#Scenario: Login to application
#Given Launch the browser with url
#When user enter "dsdeepaganesh@gmail.com" and "Testing01"
#Then CRM homepage displayed
#And click on Contact tab


