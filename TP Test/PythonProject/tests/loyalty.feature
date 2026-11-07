Feature: Loyalty Points Calculation
  Scenario: Award points for a standard purchase
    Given a user has a purchase amount of 200
    When the points are calculated
    Then the user should receive 20 points

    