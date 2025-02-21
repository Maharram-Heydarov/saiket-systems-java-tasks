package com.saiketsystems.todolist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList todoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the To-Do List App");
        boolean running = true;
        while (running) {
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task Completed");
            System.out.println("3. List Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    todoList.addTask(title);
                    System.out.println("Task added");
                    break;
                case 2:
                    System.out.print("Enter task index to mark completed: ");
                    int index = scanner.nextInt();
                    try {
                        todoList.markTaskCompleted(index);
                        System.out.println("Task marked completed");
                    } catch (IndexOutOfBoundsException ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }
                    break;
                case 3:
                    todoList.getTasks().forEach((task) -> System.out.println(todoList.getTasks().indexOf(task) + ": " + task));
                    break;
                case 4:
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
