Feature: Overall Functionality 

Background: 
	Given User launch the adactin application 
	When user login to the application 
	
@SmokeTest 
Scenario Outline: Verify the user is able to login the application 

	Given User launch the application 
	When User enter the valid "<username>" in User field 
	And User enters the valid "<password>" in password field 
	And User click the login button 
	Then User verify the home page and navigate to next page 
	
	
	Examples: 
	
	|username|password|
	|AAA|111|
	|BBB|222|
	|Stefanbabu|stefan@143|
	
Scenario: User checking the forum and select hotel 

	When User selecting the location "Brisbane" as "value" of the hotel 
	And User select the hotel "Hotel Sunshine"as "value" 
	And User selecting the room type "Double" as "value" 
	And User selecting number of rooms "2" as "value" 
	And User selecting checkin date "17/08/2020" 
	And User selecting checkout date "18/08/2020" 
	And User selecting how many Adult per Room "2" as "value" 
	And user selecting how many childrens per Room "1" as "value" 
	And user Click the Search button 
	Then User verify the search hotel page and navigate to next page 
	
	@RegressionTest
	Scenario: User Verify the selected hotel page 
	
		When User select the Radio Button 
		And  User click the submit Button 
		Then User navigate to next page 
		
	Scenario: User enters details in Book a Hotel Page 
	
		When User enters the first name 
		And User enter the last name 
		And User enter the billing Address 
		And User enter the credit card number 
		And User selecting credit card type 
		And User selecting expiry date 
		And User enter CVV number 
		And User Click the Book now button 
		Then User navigate to the Booking configuration page 
		
	Scenario: User Verify Booking configuration Page 
	
		When User click the My Itineary Button 
		And User checking Booked Itineary page and click the logout button 
		Then User navigated to the logged out page. 
		
		
		
		
		
		
