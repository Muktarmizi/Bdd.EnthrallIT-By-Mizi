#Author: mizimuktar0@gmail.com
#Date : 02/07/2025
#Time : 01:11am


@login
Feature: Log In
  As an user
  I want to login with my valid credentials to Enthrall IT
  In order to get access of the Application

  Background: User navigate to Application URL
    Given User is on the enthrall IT Homepage URL "https://enthrallit.com/"

  Scenario: Login with valid credentials
    When Click on login from Menu Section
    And User enter UserId in the User field
    And User enter Password in the Password field
    And User finally click on Login Button
    Then User will navigate to DashBoard Page

