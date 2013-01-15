Feature: A beverage that holds 16 oz of beer to make available for drinking
  As a drinker
  I want beer that comes in a pint
  In order to drink from it

  Scenario: A full pint should equal 16 oz
    Given I have a pint
    When I fill the pint full
    Then there should be 16 oz of beer in the pint

  Scenario: When a pint dispenses 1 oz then there should be 1 oz less in the pint
    Given I have a pint with 16 oz of beer
    When I dispense 1 oz
    Then there should be 15 oz of beer in the pint

  Scenario: A pint can never hold negative oz
    Given I have a pint with 5 oz of beer
    When I dispense 10 oz
    Then The actual amount dispensed should be 5 oz
    And there should be 0 oz of beer in the pint

  Scenario: A pint can never hold more than 16 oz
    Given I have a pint with 10 oz of beer
    When I fill it with 10 oz
    Then The actual amount filled should be 6 oz
    And there should be 16 oz of beer in the pint