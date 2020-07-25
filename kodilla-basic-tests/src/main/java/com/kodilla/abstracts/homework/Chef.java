package com.kodilla.abstracts.homework;

public class Chef extends Job {
    public Chef() {
        super(500);
    }

    @Override
    public void giveResponsibilities() {
        System.out.println("Cook meals.");
    }
}
