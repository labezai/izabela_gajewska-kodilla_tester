package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Shape;

public class CarRace {
    public static void main(String[] args) {
        Mustang mustang = new Mustang(200, 50, 70);
        doRace(mustang);

        Tesla tesla = new Tesla(150, 25, 30);
        doRace(tesla);

        Lexus lexus = new Lexus(300, 20, 40);
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
