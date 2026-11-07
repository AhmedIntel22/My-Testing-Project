Feature: Fizz Buzz Game
  So that plays can be validated
  As a Fizz Buzz umpire
  I want to enter a play and see the correct answer

  Scenario: Get answers based on played numbers
    Given I am officiating a FizzBuzz game
    When the number 1 is played
    Then I should be told the correct answer is "1"
  Scenario: Testing Fizz rule
    Given I am officiating a FizzBuzz game
    When the number 3 is played
    Then I should be told the correct answer is "Fizz"

  Scenario: Testing Buzz rule
    Given I am officiating a FizzBuzz game
    When the number 5 is played
    Then I should be told the correct answer is "Buzz"

