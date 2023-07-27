

Feature: Apllication login

Scenario: user sould login successfully
 Given User should launch URL
 When User is able to enter login credentials and clicked on login button
 Then User should navigate to dashboard
 And clicked on logout button
 
 
 Scenario: Login with set of data
 
 Given User should launch URL
 When User is able to enter login credentials "Jankin" and "Paul" and clicked on login button
 Then User should navigate to dashboard
 And clicked on logout button
 And login page displayed = "true"
 