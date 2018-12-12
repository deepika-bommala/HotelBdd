Feature: Hotel Login Functionality

Scenario: Username password not entered
Given User is on login page
When username password is blank
Then Display error Message 'Please enter Username'

Scenario: Username is given but password is not given
Given User is on login page
When username is given but password is blank
Then Display error Message 'Please enter password'

Scenario: Invalid username password
Given User is on login page
When Invalid username password are entered
Then Display alert box 'Invalid login! Please try again!'

Scenario: Valid username password
Given User is on login page
When Valid username password are entered
Then Navigate to hotelbooking page

