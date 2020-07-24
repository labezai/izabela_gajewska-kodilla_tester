package com.kodilla.inheritance.homework;

public class SystemRestart extends OperatingSystem {

    public void restartSystem() {
        System.out.println("Restarting system...");
    }

    public void systemRestarted() {
        System.out.println("System had been restarted");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning system on.");
    }

    public SystemRestart(int YearOfIssue) {
        super(YearOfIssue);
        System.out.println("System Restart constructor.");
    }
}
