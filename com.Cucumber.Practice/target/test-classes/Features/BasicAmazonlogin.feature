Feature: Basic Login Feature Of Amazon

  Scenario: Login with Valid Credentials
    Given user should be on login page
    When user enters username in username text field
    And user click on continue button
    Then user navigates to next page for entering  password in password text feild
    And user clicks on sign in button
    Then user navigates to home page "Online Shopping site in India:"
