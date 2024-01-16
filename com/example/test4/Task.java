package com.example.test4;


import java.util.ArrayList;
import java.util.List;

public class Task {
    private static int counter = 1;
    private int id;
    private String title;
    private String description;
    private boolean completed;

    public Task(String title, String description) {
        this.id = counter++;
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        completed = true;
    }
}

class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title, String description) {
        Task newTask = new Task(title, description);
        tasks.add(newTask);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void markTaskAsCompleted(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.markAsCompleted();
                break;
            }
        }
    }

    public void removeTask(int taskId) {
        tasks.removeIf(task -> task.getId() == taskId);
    }

    public String getTaskListAsString() {
        StringBuilder taskListString = new StringBuilder();
        for (Task task : tasks) {
            taskListString.append(task.getId()).append(". ")
                    .append(task.getTitle()).append(" - ")
                    .append(task.isCompleted() ? "выполнено" : "не выполнено")
                    .append("\n");
        }
        return taskListString.toString();
    }

    public int getTaskIndexByString(String taskString) {
        for (Task task : tasks) {
            if (taskString.contains(String.valueOf(task.getId()))) {
                return task.getId();
            }
        }
        return -1;
    }
}
