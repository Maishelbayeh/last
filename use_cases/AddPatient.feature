Feature: Patient Regisrtation

Scenario: Add Patient  with different data
	Given Admin is on Add_patient page
	When Admin enters following Patient details
	|  123	| naveen | khalili | nav@gmail.com | 99999 | Nablus |12-3-2022|false|
	|  456	| tom | ali | tom@gmail.com | 99999 | Tulkarm |14-2-2022|true|
	|  785	| lisa |hmoda| lisa@gmail.com | 8887777 | Hebron |19-2-2022| false|
	Then user registration should be successful
	
	
Scenario:  Add Patient with different data with columns
	Given Admin is on Add_patient page
	When Admin enters following Patient details with columns
		|id| firstname | lastname | email | phone | city |date_visit|visit flag|
		|  123	| naveen | khalili | nav@gmail.com | 99999 | Nablus |12-3-2022|false|
	|  456	| tom | ali | tom@gmail.com | 99999 | Tulkarm |14-2-2022|true|
	|  785	| lisa |hmoda| lisa@gmail.com | 8887777 | Hebron |19-2-2022| false|
	Then user registration should be successful	