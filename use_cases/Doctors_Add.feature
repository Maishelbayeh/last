Feature: Add doctor
       Descreption:Add doctor not exist
       Actors:User
       
Background: doctors
 Given These are the doctors
     |Dr_id|Dr_name|Dr_medical specialty|Dr_phone|password |city     |bill|
	 |1    |Ahmad  |Gynecologist        |05992368|ahmad123 |nablus   |80  |
	 |2    |Adam   |dentist             |05992368|adam123  |nablus   |100 |
	 |3    |Bassam |Neurologist         |05996899|bassam123|jerusalem|150 |
       
Scenario: Successfully add
 	Given that the user is logged in
 	And  the user want to add doctor with ID "4" , and name "Sameh" , and Dr_medical specialty "Nerves" , and Dr_phone "05987658", and password "Smsm" ,and city "Jenin" ,and bill "200" 
 	When the doctor is not exist before
 	Then the doctor added
 	
Scenario: Unsuccessfully add
	Given that the user is logged in 
 	And  the user want to add doctor with ID "2" 
	When  the doctor already exist
	Then  error message "doctor is already exist" is given     
	

     