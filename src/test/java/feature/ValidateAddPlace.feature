
Feature: Validate Place API's

@AddPlace
Scenario Outline: vrify the add place API

		Given Add Place payload with "<name>" "<language>" "<adress>"
		When User calls "addPlaceAPI" with "POST" Http request
		Then Response in the API call is success and status code 200
		And "status" is "ok"
		And "scope" is "APP"
		
		Examples: 
		
			|name     | language 		|address 					   |
			|AB House | English  		|Stree 1 GP road c    |
	# 	|ABC House 1 | Spanish  |Dallas Street 01 NY	 |
			
			
@DeletePlace			
Scenario: Verify that the delete functionality working as expected 
		Given DeletePlace API
		When User calls "addPlaceAPI" with "POST" Http request
		Then Response in the API call is success and status code 200
		And "status" is "ok"
		And "scope" is "APP"
			
			
			
			
			
			
			
