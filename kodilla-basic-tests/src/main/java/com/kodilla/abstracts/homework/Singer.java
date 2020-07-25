package com.kodilla.abstracts.homework;

public class Singer extends Job{
    public Singer() {
        super(25000);
    }

    @Override
    public void giveResponsibilities() {
        System.out.println("Entertain people.");
    }
}
