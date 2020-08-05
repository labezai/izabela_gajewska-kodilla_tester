package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Lexus;
import com.kodilla.collections.interfaces.homework.Mustang;
import com.kodilla.collections.interfaces.homework.Tesla;

import java.util.Random;

public class CarApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15)+ 1];
        for (int n = 0; n < cars.length; n++)
            cars [n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCarInfo(car);
    }

    private static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int a = random.nextInt() * 0 + 1;
        int b = random.nextInt() * 0 + 1;
        int c = random.nextInt() * 0 + 1;
        if (drawnCarKind == 0)
            return new Lexus(a);
         else if (drawnCarKind == 1)
                return new Mustang(a);
        else
                return new Tesla(a);
        }
    }

