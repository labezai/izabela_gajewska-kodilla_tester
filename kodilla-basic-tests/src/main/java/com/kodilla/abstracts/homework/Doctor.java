package com.kodilla.abstracts.homework;

public class Doctor extends Job{
    public Doctor() {
        super(1000);
    }

    @Override
    public void giveResponsibilities() {
        System.out.println("Cure people.");
    }
}
