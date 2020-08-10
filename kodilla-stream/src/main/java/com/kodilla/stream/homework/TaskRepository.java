package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTaskList() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Raport", LocalDate.of(2020, 5, 11), LocalDate.of(2032, 5, 11)));
        tasks.add(new Task("Analiza", LocalDate.of(2020, 5, 18), LocalDate.of(2022, 5, 11)));
        tasks.add(new Task("Analiza 2", LocalDate.of(2019, 12, 11), LocalDate.of(2023, 1, 1)));
        tasks.add(new Task("Test", LocalDate.of(2017, 1, 15), LocalDate.of(2028, 4, 13)));
        tasks.add(new Task("Testy ", LocalDate.of(2020, 3, 11), LocalDate.of(2029, 3, 21)));
        tasks.add(new Task("Raport z testowania", LocalDate.of(2018, 2, 28), LocalDate.of(2028, 2, 28)));
        tasks.add(new Task("Projekt", LocalDate.of(2019, 6, 16), LocalDate.of(2035, 6, 16)));

        return tasks;
    }
}
