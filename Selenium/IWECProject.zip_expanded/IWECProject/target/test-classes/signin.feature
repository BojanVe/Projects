Feature: Login Functionality
 
Scenario: Sign in User with Valid Credentials

 Given User is on Home Page
 When User Navigate to SignIn Page
 And User enters valid UserName and valid Password
 Then User should be successfully loged in and see MyAccount 
 Then End test by closing the window