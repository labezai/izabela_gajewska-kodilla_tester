package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Mustang mustang = new Mustang(200);
        doRace(mustang);

        Tesla tesla = new Tesla(150);
        doRace(tesla);

        Lexus lexus = new Lexus(300);
        doRace(lexus);
    }

    private static void doRace(Car car) {
        System.out.println(car.increaseSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.decreaseSpeed());
        System.out.println(car.decreaseSpeed());
        System.out.println(car.getSpeed());
    }
}
