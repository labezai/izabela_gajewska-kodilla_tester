package com.kodilla.abstracts.homework;

public class ShapeProcessor {

    public void process(Shape shape) {
        System.out.println("Formula for a triangle circuit is" + " " + shape.getCircuit() + " " + "and formula for a triangle area is" + " " + shape.getSurfaceArea());
    }

    public void process1(Shape shape) {
        System.out.println("Formula for a square circuit is" + " " + shape.getCircuit() + " " + "and formula for a square area is" + " " + shape.getSurfaceArea());
    }

    public void process2(Shape shape) {
        System.out.println("Formula for a rectangle circuit is" + " " + shape.getCircuit() + " " + "and formula for a rectangle area is" + " " + shape.getSurfaceArea());
    }
}
