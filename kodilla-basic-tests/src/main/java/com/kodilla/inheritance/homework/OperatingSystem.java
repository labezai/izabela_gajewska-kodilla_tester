package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfIssue;

    public OperatingSystem(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void turnOn() {
        System.out.println("Operating system was turned on.");
    }

    public void turnOff() {
        System.out.println("Operating system was turned off.");
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void displayYearOfIssue() {
        System.out.println("Year of issue is:" + " " + yearOfIssue);
    }
}
