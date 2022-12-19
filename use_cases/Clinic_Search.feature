Feature: Searching for clinics by their number or names.
         Description:  Admin search for clinic
	     Actors:Admin
 
 
        
Scenario: clinic not found 
Given that the admin is loggined in 
And  the admin want to search clinic with name "Jeolle"
When the clinic not found
Then error message "not found"


Scenario: Admin Search by Clinic Number
Given that the admin is loggined in 
And   the admin search by number "1"
When  the clinic found
Then  the clinic with name "General Medicine" is found 

Scenario: User Search by Clinic Name
Given that the admin is loggined in
And   the admin search by name "General Medicine"
When  the  clinic exist
Then the clinic with number "1" is found

#Scenario: User Search by Clinic Number
#Given that the user is loggined in
#When the user enter the number of clinic 
#Then the Clinic name related to that number will be shown
# 
# 
#Scenario: User Search by Clinic Name
#Given that the user is loggined in
#When the user enter the name of clinic 
#Then the Clinic number related to that name will be shown


 