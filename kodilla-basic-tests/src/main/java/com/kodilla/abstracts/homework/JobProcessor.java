package com.kodilla.abstracts.homework;

public class JobProcessor {
    public void process(Job job) {
        System.out.println("makes" + " " + job.getSalary() + " " + "$ per month");
        job.giveResponsibilities();
    }
}
