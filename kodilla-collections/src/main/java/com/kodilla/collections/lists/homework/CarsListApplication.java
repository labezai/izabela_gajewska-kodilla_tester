package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Lexus;
import com.kodilla.collections.interfaces.homework.Mustang;
import com.kodilla.collections.interfaces.homework.Tesla;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Mustang mustang = new Mustang(500);
        cars.add(mustang);
        cars.add(new Lexus(300));
        cars.add(new Tesla(230));

        cars.remove(1);
        cars.remove(mustang);

        System.out.println(cars.size());

        for (Car tesla : cars) {
            if (tesla.getSpeed() > 100)
                CarUtils.describeCarInfo(tesla);
        }
        for (Car lexus : cars) {
            if (lexus.getSpeed() > 100)
                CarUtils.describeCarInfo(lexus);
        }
    }
}
