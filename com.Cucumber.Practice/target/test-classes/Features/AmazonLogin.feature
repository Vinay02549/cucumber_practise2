Feature: Login page
  In order to test login page
  As a Registered user
  I want to specify the login conditions

  Scenario: Amazon Login Page
    Given user is on Amazon landing page
    Given Sign in button is present on screen
    When user clicks on sign in button
    Then user can see login screen
    When user enters "vinaydikonda333@gmail.com" in username field
    When user enters "Vinay@123" in password field
    When user clicks on sign-in button
    Then user is on home page
    Then title of home page is "Amazon"

  Scenario: Amazon Login Page
    Given user is on Amazon landing page
    And Sign in button is present on screen
    When user clicks on sign in button
    Then user is displayed login screen
    When user enters "vinaydikonda333@gmail.com" in username field
    And user enters "Vinay@123" in password field
    And user clicks on sign-in button
    Then user is on home page
    Then title of home page is "Amazon"
    But sign in button is not present
