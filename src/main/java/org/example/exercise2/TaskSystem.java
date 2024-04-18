package org.example.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TaskSystem {
    private List<Task> tasks;

    public TaskSystem() {
        this.tasks = new ArrayList<>();
    }
    public void addTask(int id,String description) {
        tasks.add(new Task(id,description));
    }
    public void completeTask(int id) {
        Task task = tasks.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
        if(task != null){
            task.setCompleted(true);
        } else {
            System.out.println("Id inválido");
        }
    }
    public List<Task> getCompletedTasks() {
        return tasks.stream()
                .filter(Task::getCompleted)
                .collect(Collectors.toList());
    }
    public List<Task> getIncompleteTasks() {
        return tasks.stream()
                .filter(Task::getInCompleted)
                .collect(Collectors.toList());
    }

}
