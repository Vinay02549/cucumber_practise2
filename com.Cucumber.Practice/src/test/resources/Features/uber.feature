# Author vinay D
@All
Feature: uber Booking Feature

  @Smoke
  Scenario: Booking Cab Sedan
    Given user wants to select a car type "Sedon" from uber application
    When user selects car "Sedon" and pick up point "Bangalore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then user pays 1300 USD

  @Regression
  Scenario: Booking Cab SUV
    Given user wants to select a car type "suv" from uber application
    When user selects car "Sedon" and pick up point "Bangalore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then user pays 1080 USD

  @Prod
  Scenario: Booking Cab for Mini
    Given user wants to select a car type "Mini" from uber application
    When user selects car "Sedon" and pick up point "Bangalore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then user pays 2090 USD
