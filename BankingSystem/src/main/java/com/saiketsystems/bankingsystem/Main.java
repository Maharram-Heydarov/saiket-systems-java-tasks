package com.saiketsystems.bankingsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC12345", 1000.0);
        BankService service = new BankService(account);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Banking System");

        boolean running = true;
        while (running) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    try {
                        service.deposit(depositAmount);
                        System.out.println("Deposit successful");
                    } catch (IllegalArgumentException ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        service.withdraw(withdrawAmount);
                        System.out.println("Withdrawal successful");
                    } catch (IllegalArgumentException ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }
                    break;
                case 3:
                    System.out.println(service.getAccount());
                    break;
                case 4:
                    service.getTransactions().forEach(System.out::println);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close();
        System.out.println("App terminated");
    }
}
