Feature: Add clinic
       Descreption:Add clinic not exist
       Actors:Admin
       
       Background: clinics
   Given these are the clinics
        | Clinic_num |  Clinic_name   |
        |      1     |General Medicine|
        |      2     |nose and throat |
        |      3     |surgery         |
       
Scenario: Successfully add
 	Given that the admin is logged in
 	And  the admin want to add clinic with number "4" , and name "Bones and nerves"
 	When the clinic is not exist before
 	Then the clinic added
 	
Scenario: Unsuccessfully add
	Given that the admin is logged in 
 	And   the admin want to add exist clinic with number "2" , and name "nose and throat"
	When  the clinic already exist
	Then  the error message "clinic is already exist" is given     
	
Scenario: Unsuccessfully add
     Given that the admin is logged in
     And the admin clinic only by name "Dental"
     Then the error message "These fields are required"
    