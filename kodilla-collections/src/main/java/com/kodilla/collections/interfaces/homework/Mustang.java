package com.kodilla.collections.interfaces.homework;

public class Mustang implements Car {
    private int speed;
    private int decrease;
    private int increase;


    public Mustang(int speed) {
        this.speed = speed;
        this.decrease = decrease;
        this.increase = increase;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    public int increaseSpeed() {
        return speed + increase;
    }

    @Override
    public int decreaseSpeed() {
        return speed - decrease;
    }
}