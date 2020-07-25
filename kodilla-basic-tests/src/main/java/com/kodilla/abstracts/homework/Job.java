package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;

    public Job(int salary) {

        this.salary = salary;
    }

    public abstract void giveResponsibilities();

    public int getSalary() {
        return salary;
    }

    public void showResponsibilities(){
        System.out.println("Cook meals.");
    }
    public void showResponsibilities1() {
        System.out.println("Cure people");
    }
    public void showResponsibilities2() {
        System.out.println("Entertain people");
    }
    public void showResponsibilities3() {
        System.out.println("Teach people");
    }


}
