package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    Person chef = new Person("Adam", 38, new Chef());
    Person singer = new Person("Kasia", 16, new Singer());
    Person teacher = new Person("Wojtek", 90, new Teacher());
    Person doctor = new Person("Aloizy", 50, new Doctor());
}