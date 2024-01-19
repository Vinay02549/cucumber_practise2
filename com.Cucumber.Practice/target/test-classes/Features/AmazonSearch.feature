# Author  Vinay D..

Feature: Amazon Search

@Smoke
Scenario: Search a product Apple
Given I have a search field on Amazon Page
When I search for a product with name "Apple MacBook Air" and price 1230
Then Product with name "Apple MacBook Pro" should be displayed
Then Order id is 12345 and username is "Vinay"

@Regression
Scenario: Search a product Iphone
Given I have a search field on Amazon Page
When I search for a product with name "Apple MacBook Air" and price 1230
Then Product with name "Apple MacBook Pro" should be displayed
Then Order id is 12345 and username is "Vinay"