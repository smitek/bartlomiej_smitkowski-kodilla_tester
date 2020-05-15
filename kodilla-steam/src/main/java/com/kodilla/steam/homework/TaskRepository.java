package com.kodilla.steam.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTask() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Drive Car", LocalDate.of(2019, 05, 22), LocalDate.of(2019, 05, 30)));
        tasks.add(new Task("Work", LocalDate.of(2019, 01, 01), LocalDate.of(2019, 12, 31)));
        tasks.add(new Task("Swim", LocalDate.of(2019, 07, 22), LocalDate.of(2020, 07, 30)));
        tasks.add(new Task("Build", LocalDate.of(2019, 04, 02), LocalDate.of(2020, 04, 30)));
        return tasks;
    }
}