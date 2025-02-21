package com.saiketsystems.calculator;


public class CalculatorService {
    private final Calculator calculator = new Calculator();

    public double performOperation(String operator, double a, double b) {
        return switch (operator) {
            case "+" -> calculator.add(a, b);
            case "-" -> calculator.subtract(a, b);
            case "*" -> calculator.multiply(a, b);
            case "/" -> calculator.divide(a, b);
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }
}
