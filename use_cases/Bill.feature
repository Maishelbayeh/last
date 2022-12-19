Feature: Schedule 
        Description: all patient who book 
        
     Background: visited
Given these are bookings 
     |  id |  Dr_id |  bookdate    |  booktime   |  Bill |
     | 123 |    3   |  12-3-2022   |  12:30      |  150  |
     | 785 |    1   |  19-2-2022   |  6:00       |  80   |
     | 444 |    1   |  19-2-2022   |  4:00       |  80   |																		
     | 123 |    2   |  28-2-2022   |  1:00       |  100  |   
        
 Scenario: On time
 Given there is the patient with ID "123"
 And the patient come in time where Previously selected
 When the patient pay his bill
 Then the booking delete from Schedule table
 
 
 Scenario: Conflicting dates 
  Given there is the patient with ID "444"
  And the patient come in another booktime 6:00
  When the bookdate Conflicts with another patient for same doctor
  Then the booking time will delayed to another time 
  
  
  Scenario: no comming
  Given there is the patient with ID "785"
  And the patient not comming in his booktime
  When the bookdate has passed 
  Then the booking will deleted
  