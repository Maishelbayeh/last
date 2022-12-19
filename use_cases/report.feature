Feature: patient Report
 Background: visited
Given these are bookings 
     |  id |  Dr_id |  bookdate    |  booktime   |  Bill |
     | 123 |    3   |  12-3-2022   |  12:30      |  150  |
     | 785 |    1   |  19-2-2022   |  6:00       |  80   |
     | 444 |    1   |  19-2-2022   |  4:00       |  80   |																		
     | 123 |    2   |  28-2-2022   |  1:00       |  100  |   
Scenario: how many patient come to hospital in specifical month
Given month is "2"
Then the Patient report is displays


Scenario: financial stats to hospital specifical month
Given month is "2"
Then the Bills report is displays


