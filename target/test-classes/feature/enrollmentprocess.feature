# Author: mizimuktar0@gmail.com
# Date: 02/08/2025
# Time: 10:02 PM
@enrollment
Feature: User Enrollment  Process in Enthrall IT
  As a user,  
  I want to enroll in Enthrall IT,  
  So that I can access the application features.

  Background: User navigate to Application URL
    Given User is on the Enthrall IT Homepage URL

  @sanity
  Scenario: Successful User Enrollment
    When User click on the Login Button navigated to Login Page
    When User enters valid credentials and click on the Login Button
    Then User should be navigated to Dashboard
    When User click on the Automation section
    Then User should be navigated to the EnrollNow Automation Page
    When User click on the EnrollNow Button
    Then User should be navigated to the Enroll home page
    When User fills in all required fields and click on the Submit Button
    Then User should be navigated to the successful enrollment page
