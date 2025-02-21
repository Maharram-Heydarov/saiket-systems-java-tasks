package com.saiketsystems.numberguessinggame;


import java.util.Random;

public class NumberGuessingGame {
    private final int targetNumber;
    private int attempts;

    public NumberGuessingGame() {
        this.targetNumber = new Random().nextInt(100) + 1;
        this.attempts = 0;
    }

    public String guess(int number) {
        attempts++;
        if (number == targetNumber) {
            return "Correct! Attempts: " + attempts;
        } else if (number < targetNumber) {
            return "Too low";
        } else {
            return "Too high";
        }
    }
}
