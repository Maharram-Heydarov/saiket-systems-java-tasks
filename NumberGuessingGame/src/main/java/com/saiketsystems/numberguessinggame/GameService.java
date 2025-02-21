package com.saiketsystems.numberguessinggame;

public class GameService {
    private final NumberGuessingGame game = new NumberGuessingGame();

    public String makeGuess(int number) {
        return game.guess(number);
    }
}
