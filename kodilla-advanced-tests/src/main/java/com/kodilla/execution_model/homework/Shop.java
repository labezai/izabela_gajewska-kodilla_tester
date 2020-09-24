package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    ZonedDateTime newZonedDateTime = zonedDateTime.minus(Period.ofYears(2));

    private List<Order> orders = new ArrayList<>();

    public void addOrder (Order order) {
        this.orders.add(order);
    }


    public void theBiggestAndTheSmallestValue (double orderValue ) {

    }

    public int getSize() {
        return this.orders.size();
    }

    public int getValue(List<Integer> list) {
        int sum = 0;

        for (int i : list)
            sum = sum + i;

        return sum;
    }

    // zwrócenie listy zamówień z zakresu dwóch dat,
    // pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia),




}
