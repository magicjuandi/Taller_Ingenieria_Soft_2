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
        if(tasks.contains(id)){
            tasks.get(id).setCompleted();
        }else{
            System.out.println("Id invalido");
        }
    }
    public List<Task> getTasks(Predicate<Task> c) {
        return tasks.stream()
                .filter(c)
                .collect(Collectors.toList());
    }


}
