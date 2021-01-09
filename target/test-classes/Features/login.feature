@test
Feature: Trendyol



Background:

  @test
  Scenario: login browser
    And  I click browser
    When I see login page
    And I fill:
    |mail area| testtrendyol@gmail.com|
    And I fill:
    |password area| Deneme123!|
    And I click login button

