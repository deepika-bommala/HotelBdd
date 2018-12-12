Feature: Hotel Booking Functionality

Scenario: FirstName not entered
Given User is on HotelBooking page
When FirstName is blank
Then Display alert box 'Please fill the First Name'

Scenario: LastName not entered
Given User is on HotelBooking page
When LastName is blank
Then Display alert box 'Please fill the Last Name'

Scenario: EmailId not entered
Given User is on HotelBooking page
When EmailId is blank
Then Display alert box 'Please fill the Email'

Scenario: Invalid EmailId entered
Given User is on HotelBooking page
When Invalid EmailId is given
Then Display alert box 'Please enter valid Email Id'

Scenario: Mobile Number not entered
Given User is on HotelBooking page
When MobileNo is blank
Then Display alert box 'Please fill the Mobile No'

Scenario: Invalid mobile number entered
Given User is on HotelBooking page
When Invalid mobileNo entered
Then Display alert box 'Please enter valid Contact no'

Scenario: Gender is not selected
Given User is on HotelBooking page
When Gender is not selected
Then Display alert box 'Please Select the Gender'

Scenario: City is not Choosen
Given User is on HotelBooking page
When City is not choosen
Then Display alert box 'Please select city'

Scenario: State is not Choosen
Given User is on HotelBooking page
When State is not choosen
Then Display alert box 'Please select state'

Scenario: Room type is not Choosen
Given User is on HotelBooking page
When Room type is not choosen
Then Display alert box 'Please select the Room type'

Scenario: Card Holder Name not entered
Given User is on HotelBooking page
When Card Holder Name is blank
Then Display alert box 'Please fill the Card holder name'

Scenario: Debit Card Number not entered
Given User is on HotelBooking page
When Debit Card Number is blank
Then Display alert box 'Please fill the Debit card Number'

Scenario: CVV not entered
Given User is on HotelBooking page
When CVV is blank
Then Display alert box 'Please fill the CVV'

Scenario: Expiration month not entered
Given User is on HotelBooking page
When Expiration month is blank
Then Display alert box 'Please fill expiration month'

Scenario: Expiration Year not entered
Given User is on HotelBooking page
When Expiration Year is blank
Then Display alert box 'Please fill the expiration year'

Scenario: All valid details given
Given User is on HotelBooking page
When All Valid details given
Then Navigate to success page
