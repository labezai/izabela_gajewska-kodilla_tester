package com.kodilla.inheritance.homework;

public class Year extends OperatingSystem {
    public void YearOfIssue() {
        System.out.println("Year of issue is:");
    }

    public Year(int YearOfIssue) {
        super(YearOfIssue);
        System.out.println("Year constructor");
    }
}
