Feature: invoice 
       Descreption: Patient history
       
       
Scenario: Patient not found 
Given there is a patient with id "456"
When the patient does not have any visited history
Then the message will alert "Sorry, You dont have any visited before"


Scenario: Patient found
Given there is a patient with id "123"
When the patient have visited history
Then the informetion for visited about this patient will be shown