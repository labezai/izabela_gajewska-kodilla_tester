package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    public Triangle() {
        super("a * 3", "(a*h)/2");
    }

    @Override
    public void giveCircuit() {
        System.out.println("Formula for triangle circuit is:");

    }

    @Override
    public void giveSurfaceArea() {
        System.out.println("Formula for triangle surface area is:");

    }
}
