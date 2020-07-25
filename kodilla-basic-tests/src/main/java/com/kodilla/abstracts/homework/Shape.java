package com.kodilla.abstracts.homework;

public abstract class Shape {
    private String circuit;
    private String surfaceArea;

    public Shape(String circuit, String surfaceArea) {
        this.circuit = circuit;
        this.surfaceArea = surfaceArea;
    }

    public String getCircuit() {
        return circuit;
    }

    public String getSurfaceArea() {
        return surfaceArea;
    }

    public abstract void giveCircuit();

    public abstract void giveSurfaceArea();
}
