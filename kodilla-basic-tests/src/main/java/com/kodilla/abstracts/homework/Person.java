package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private String job;

    public Person(String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    Person chef = new Person("Adam", 38, "chef");
    Person singer = new Person("Kasia", 16, "singer");
    Person teacher = new Person("Wojtek", 90, "teacher");
    Person doctor = new Person("Aloizy", 50, "doctor");

    public static void main(String[] args) {
        Chef chef = new Chef();
        chef.showResponsibilities();
        Doctor doctor = new Doctor();
        doctor.showResponsibilities1();
        Singer singer = new Singer();
        singer.showResponsibilities2();
        Teacher teacher = new Teacher();
        teacher.showResponsibilities3();
    }

}