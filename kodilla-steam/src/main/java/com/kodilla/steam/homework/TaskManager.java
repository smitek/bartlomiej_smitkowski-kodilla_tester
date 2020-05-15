package com.kodilla.steam.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<String> tasks = TaskRepository.getTask()
                .stream()
                .filter(t -> t.getDeadline().isAfter(LocalDate.now()))
                .map(t -> t.getName())
                .collect(Collectors.toList());
        System.out.println(tasks);
    }

    public static String getName(Task task) {
        return task.getName();
    }
}
