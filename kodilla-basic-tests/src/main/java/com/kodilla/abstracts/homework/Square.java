package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public Square() {
        super("4 * a", "a * a");
    }

    @Override
    public void giveCircuit() {
        System.out.println("Formula for a square circuit is:");

    }

    @Override
    public void giveSurfaceArea() {
        System.out.println("Formula for a square surface area is:");

    }
}