package com.saiketsystems.temperatureconverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConverterService service = new ConverterService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Temperature Converter");
        boolean running = true;
        while (running) {
            System.out.println("Enter conversion type (c-to-f or f-to-c) or 'exit' to quit:");
            String type = scanner.next();
            if (type.equalsIgnoreCase("exit")) {
                running = false;
                continue;
            }
            System.out.print("Enter temperature value: ");
            double temp = scanner.nextDouble();
            try {
                double converted = service.convert(type, temp);
                System.out.println("Converted value: " + converted);
            } catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        scanner.close();
        System.out.println("App terminated");
    }
}
