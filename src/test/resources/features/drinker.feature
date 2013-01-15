Feature: A simulated bar patron
  As a drinker
  I want to drink a beverage
  In order to relax and have a good time

  Scenario: A sip should only be 1 oz
    Given I have a full pint
    When I take a sip
    Then there should be 15 oz of beer in the pint

  Scenario: A drink should be 2 oz
    Given I have a full pint
    When I take a drink
    Then there should be 14 oz of beer in the pint

  Scenario: A slam should finish off the beverage
    Given I have a pint with 10 oz of beer
    When I slam it
    And there should be 0 oz of beer in the pint
