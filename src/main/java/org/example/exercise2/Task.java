package org.example.exercise2;

import java.util.Objects;

public class Task {
    private int id;
    private String description;
    private boolean completed;

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", completed=" + completed +
                '}';
    }

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.completed = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return id == task.id && isCompleted() == task.isCompleted() && Objects.equals(getDescription(), task.getDescription());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getDescription(), isCompleted());
    }

    public String getDescription() {
        return description;
    }

    public boolean getCompleted() {
        return completed == true;
    }
    public boolean getInCompleted() {
        return !completed;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}
