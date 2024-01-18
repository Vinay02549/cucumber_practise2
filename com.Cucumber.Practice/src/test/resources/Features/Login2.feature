Feature: Login Feature

  Scenario Outline: Login fail - poosible combinations
    Given user is on Application landing page
    When user clicks on sign-in button
    Then user is displayed login screen
    When user enters "<UserName>" in username field
    And user enters"<Password>" in password field
    And user clicks on submit button
    Then user gets login failed error message

    Examples: 
      | UserName          | Password          |
      | incorrectusername |            123456 |
      | naveenautomation  | incorrectpassword |
      | incorrectusername | incorrectpassword |
