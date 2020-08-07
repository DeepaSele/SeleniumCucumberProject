Feature: CRM Application smoke test

Scenario: Using Datatables with cucumber
Given Launch the browser
When Open the application with url
Then user enters username and password
| dsdeepaganesh@gmail.com | Testing01|
Then CRM homepage displayed for single user
Then click on Contact tab
And Quit the browser