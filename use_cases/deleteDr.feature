
Feature:  delete doctor from the clinic by id
Actors: Admin

	Description: A admin  delete doctor by the dr_id

Background: doctors

	Given these doctors work in the clinic
		|Dr_id|Dr_name|Dr_medical specialty|Dr_phone|password|city|bill|
		|1    |Ahmad  |Gynecologist        |05992368|ahmad123 |nablus   |80|
		|2    |Adam   |dentist             |05992368|adam123  |nablus   |100|
		|3    |Bassam |Neurologist         |05996899|bassam123|jerusalem|150|

Scenario: delete doctor by dr_id
	Given: wanted to delete a doctor from a clinic
	When: admin want to delet a dr
	Then: give the Dr_id of the doctor "2"
	And: show dialod with message"this doctor is deleted"
		

	
Scenario:  cant delete doctor by dr_id
	Given: that the admin is logged in
	And: wanted to delete a doctor from a clinic
	Then: give the Dr_id of the doctor "5"
	And: show dialod with message"this doctor not exist in the clinic"
		
