package com.example.integrationtestingproject;

public class FizzBuzz {
    public String checkPlay(int playedNumber) {
        if (playedNumber % 3 == 0 && playedNumber % 5 == 0) return "FizzBuzz";
        if (playedNumber % 3 == 0) return "Fizz";
        if (playedNumber % 5 == 0) return "Buzz";
        return Integer.toString(playedNumber);
    }
}

