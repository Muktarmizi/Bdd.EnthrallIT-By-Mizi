#Author: mizimuktar0@gmail.com
#Date : 02/07/2025
#Time : 01:11am
@login
Feature: Log In
  As an user
  I want to login with my valid credentials to Enthrall IT URL
  In order to get access of the Application features

  Background: User navigate to Application URL
    Given User is on the enthrall IT Homepage URL

  @regression
  Scenario: 
    User is on the enthrall IT Homepage URL

    When User click on Login Button navigated to Login Page
    And User enter Email in the Email field
    And User enter Password in the Password field
    And User finally click on Login Button
    Then User will navigate to DashBoard Page

  @sanity
  Scenario: Login with fixed valid credentials
    When User click on Login Button navigated to Login Page
    And User enter UserId as 'Mizimuktar0@gmail.com'
    And User enter Password as 'Password$1'
    And User finally click on Login Button
    Then User will navigate to DashBoard Page

  @smoke
  Scenario Outline: Login with Sets of valid credentials
    When User click on Login Button to navigate to login page
    When User enter Email as <Email>
    And User enter Password as <Password>
    And User finally click on Login Button
    Then User will navigate to DashBoard Page

    Examples: 
      |             email                       |         password          |
      | 'mizimuktar0@gmail.com'      | 'password$1'           |
      | 'ayshasiddqua26@gmail.com' | 'Faizan2026#'          |
      | 'mariabegum2121'                | 'saimun388556Bd@' |
         