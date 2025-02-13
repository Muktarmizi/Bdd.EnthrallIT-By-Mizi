#Author: mizimuktar0@gmail.com
#Date: 02/082025
#Time : 10:02pm

@enrollment
Feature: As an User
i want to enroll as a new user to Enthrall IT
in order to get access of the Application features


 Background: user navigates to Application URL
 Give User is on the Enthrall IT Homepage URL
 
 @sanity 
  Scenario: 
//  User Click On login button User puting value in each field Click Login Button to navigate to Dashboard page
  When User Click on Automation to navigate to Automation page
  And User Click Enroll Now to navigate to enrollhome page
  And User Puting value in each field to enrollment process
  And User Double Click on Terms and Condition to select Accept 
  Then User Click Submit Button it will navigate to Successfull Page
   
    
