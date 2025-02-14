# Author: mizimuktar0@gmail.com
# Date: 02/08/2025
# Time: 10:02 PM

@enrollment
Feature: User Enrollment
  As a user
  I want to enroll as a new user in Enthrall IT
  So that I can access the application's features

  Background: User navigates to the Application URL
    Given the user is on the Enthrall IT homepage

  @sanity
  Scenario: Successful User Enrollment
    When the user clicks on the "Automation" tab to navigate to the Automation page
    And the user clicks "Enroll Now" to navigate to the Enrollment page
    And the user enters valid details in each required field for enrollment
    And the user double-clicks on "Terms and Conditions" to accept
    Then the user clicks the "Submit" button, and they are navigated to the success page
