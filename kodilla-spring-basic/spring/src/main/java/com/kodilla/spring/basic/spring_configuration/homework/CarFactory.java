package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CarFactory {

    @Bean
    public Sedan createSedan() {
        return new Sedan();
    }

    @Bean
    public Car randomCar () {
        Car car;
        Random generator = new Random();
        int chosen = generator.nextInt(3);
        if(chosen == 1) {
            car = new Cabrio();
        }else if (chosen == 2) {
            car = new SUV();
        }else {
            car = new Sedan();
        }
        return  car;
    }
}

// 1 - lato - cabrio
// 2 - zima - suv
// 3 - jesien/wiosna sedan