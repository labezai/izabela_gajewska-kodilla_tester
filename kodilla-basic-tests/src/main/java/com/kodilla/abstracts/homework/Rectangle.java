package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle() {
        super("2 * a + 2 * b", "a * b");
    }

    @Override
    public void giveCircuit() {
        System.out.println("Formula for a rectangle circuit is:");

    }

    @Override
    public void giveSurfaceArea() {
        System.out.println("Formula for a rectangle surface area is:");

    }
}