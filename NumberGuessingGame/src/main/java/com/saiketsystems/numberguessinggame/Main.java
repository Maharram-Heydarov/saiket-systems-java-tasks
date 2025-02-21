package com.saiketsystems.numberguessinggame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameService service = new GameService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Number Guessing Game (1-100)");
        boolean correct = false;
        while (!correct) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            String result = service.makeGuess(guess);
            System.out.println(result);
            if (result.startsWith("Correct")) {
                correct = true;
            }
        }
        scanner.close();
    }
}
