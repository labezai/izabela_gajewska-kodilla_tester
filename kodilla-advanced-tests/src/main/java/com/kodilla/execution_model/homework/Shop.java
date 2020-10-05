package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    LocalDate current = LocalDate.now();
    LocalDate twoYearsAgo = current.minusYears(2);
    int max = 0;
    int min = 30;

    private List<Order> orders = new ArrayList<>();

    // dodanie nowego zamówienia,
    public void addOrder(Order order) {
        this.orders.add(order);
    }

    // zwrócenie listy zamówień z zakresu dwóch dat,
    public void between(LocalDate current, LocalDate twoYearsAgo) {
        if (current.isBefore(twoYearsAgo)) {
            return;
        }
    }

    // pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia),
    public Order getMaxMinValue() {
        int a = 0;
        if (a < min) {
            a = min;
        } else if (a > max) {
            a = max;
        }
        return null;
    }

    // zwrócenie liczby zamówień,
    public int getSize() {
        return this.orders.size();
    }

    // zsumowanie wartości wszystkich zamówień.
    public double getTotalValue() {
        int sum = 0;
        for (int i = 0; i < orders.size(); i++) {
            sum += orders.get(i).getOrderValue();
        }
        return sum;
    }
}


