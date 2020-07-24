package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2020);
        operatingSystem.turnOn();

        SystemRestart systemRestart = new SystemRestart(2020);
        systemRestart.restartSystem();

        Year year = new Year(2020);
        year.displayYearOfIssue();
    }
}

