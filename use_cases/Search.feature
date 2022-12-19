Feature: Hospital Search


Scenario: Search a medical specialty Gynet
Given I have a search field on Hospital Page
When I search for a medical specialty with name "Gynet"
Then medical specialty with name "Gynecologistt" should be displayed
Then Order id is 1 and dr_name is "ahmad"


Scenario: Search a medical specialty Gyne
Given I have a search field on Hospital Page
When I search for a medical specialty with name "Gyne" 
Then medical specialty with name "Gynecologist" should be displayed
Then Order id is 1 and dr_name is "ahmad"