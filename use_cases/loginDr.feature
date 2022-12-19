Feature: doctor login
	Description: The doctor login to the clinic
	Actor: Doctor
	

Background: doctors
Given these doctors work in the clinic
		|Dr_id|Dr_name|Dr_medical specialty|Dr_phone|password|city|bill|
		|1    |Ahmad  |Gynecologist        |05992368|ahmad123 |nablus   |80|
		|2    |Adam   |dentist             |05992368|adam123  |nablus   |100|
		|3    |Bassam |Neurologist         |05996899|bassam123|jerusalem|150|
			
	
Scenario: Doctor  can login
	Given that the Dr is  logged in
	Then the Dr login succeeds
	And the Dr is logged in
	
Scenario: Dr has the wrong password
	Given that the Dr is not logged in
	And the password is wrong
	Then the Dr login fails
	And the Dr is not logged in