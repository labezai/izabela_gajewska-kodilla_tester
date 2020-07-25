package com.kodilla.abstracts.homework;

public class Teacher extends Job{
    public Teacher() {
        super(200);
    }

    @Override
    public void giveResponsibilities() {
        System.out.println("Teach kids.");
    }
}
