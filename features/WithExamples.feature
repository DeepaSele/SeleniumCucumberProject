#WITH EXAMPLES
Feature: CRM Application with Examples

Scenario Outline: Login to application with different credentials
Given Launch the browser
When Open the application with url
Then user enters with multiple User "<username>" and "<password>"
Then click on Contact tab
And Quit the browser


Examples:
   | username                  | password |
   |dsdeepaganesh@gmail.com    | Testing01|
   |deepasadasivamks@gmail.com | Testing02|
   