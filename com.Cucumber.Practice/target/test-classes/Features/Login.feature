# Author: Dikonda vinay...........
# Date
# Description
Feature: Feature to Test Login Functionality

  Scenario: Check Login is successfull with valid credentials
    Given User should be on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
