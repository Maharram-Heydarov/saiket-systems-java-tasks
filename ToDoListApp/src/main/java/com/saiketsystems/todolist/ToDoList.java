package com.saiketsystems.todolist;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(String title) {
        tasks.add(new Task(title));
    }

    public void markTaskCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markCompleted();
        } else {
            throw new IndexOutOfBoundsException("Invalid task index");
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
