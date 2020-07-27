package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mustang;
import com.kodilla.collections.interfaces.homework.Lexus;
import com.kodilla.collections.interfaces.homework.Tesla;

public class CarUtils {
    public static void describeCarInfo(Car car) {
        System.out.println(".....................................");
        System.out.println("Car kind:" + getCarName(car));
        System.out.println("Car speed is:" + car.getSpeed());
        System.out.println("Car speed increase is:" + car.increaseSpeed());
        System.out.println("Car speed decrease is:" + car.decreaseSpeed());

    }

    private static String getCarName(Car car) {
        if (car instanceof Mustang)
            return "Mustang";
        else if (car instanceof Lexus)
            return "Lexus";
        else if (car instanceof Tesla)
            return "Tesla";
        else
            return "Unknown car name";
    }
}
