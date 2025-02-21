package com.saiketsystems.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculatorService service = new CalculatorService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculator App");
        boolean running = true;
        while (running) {
            System.out.println("Enter operator (+, -, *, /) or 'exit' to quit:");
            String operator = scanner.next();
            if (operator.equalsIgnoreCase("exit")) {
                running = false;
                continue;
            }
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();
            try {
                double result = service.performOperation(operator, a, b);
                System.out.println("Result: " + result);
            } catch (ArithmeticException | IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        scanner.close();
        System.out.println("App terminated");
    }
}
