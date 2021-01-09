@test
Feature: Trendyol



Background:

  @test
  Scenario: login Trendyo
    And  I click browser
    When I see login page
    And I fill:
    |mail area| testtrendyol@gmail.com|
    And I fill:
    |password area| Deneme123!|
    And I click login button

Scenario: verify group title
  Then I verify page number 9
  And I go random seller page 1
  When I control with KADIN text in KADIN element

Scenario: add basket product
  Then I verify page number 9
  And I go random seller page 1
  When I control with KADIN text in KADIN element
  Then I click sepete ekle button element
  And I clik sepetim icon element
  When I see basket


