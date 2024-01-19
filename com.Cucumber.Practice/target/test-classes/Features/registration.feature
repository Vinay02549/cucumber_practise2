Feature: User Registration

  Scenario: user registration with different data
    Given user is on registration on page
    When user enters following user details
      | naveen | engineer | nav@gmail.com   | 9088123 | Bangalore |
      | kanna  | student  | kanna@gmsil.com | 1234567 | Pune      |
      | boss   | manager  | boss@gmail.com  | 9876543 | bombay    |
    Then user registration should be successful

  Scenario: user registration with different data with columns
    Given user is on registration on page
    When user enters following user details with columns
      | firstname | position | email           | phone  | location  |
      | naveen    | engineer | nav@gmail.com   | 9088123 | Bangalore |
      | kanna     | student  | kanna@gmail.com | 1234567 | Pune      |
      | boss      | manager  | boss@gmail.com  | 9876543 | bombay    |
    Then user registration should be successful
