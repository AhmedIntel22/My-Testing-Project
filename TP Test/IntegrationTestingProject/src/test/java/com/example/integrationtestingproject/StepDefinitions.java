package com.example.integrationtestingproject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    private FizzBuzz target;
    private String actualResult;

    @Given("I am officiating a FizzBuzz game")
    public void i_am_officiating_a_fizz_buzz_game() {
        target = new FizzBuzz();
    }

    @When("the number {int} is played")
    public void the_number_is_played(Integer number) {
        actualResult = target.checkPlay(number);
    }

    @Then("I should be told the correct answer is {string}")
    public void i_should_be_told_the_correct_answer_is(String expectedResult) {
        assertEquals(expectedResult, actualResult);
    }
}


