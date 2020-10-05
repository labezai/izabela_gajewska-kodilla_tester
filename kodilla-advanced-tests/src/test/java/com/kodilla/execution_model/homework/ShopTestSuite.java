package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ShopTestSuite {
    Shop shop = new Shop();
    Order one = new Order(143.16, 10.2020, "Mike Morus");
    Order two = new Order(254.16, 07.2017, "John Snow");
    Order three = new Order(15.74, 01.2019, "Jan Kowalski");

    @Test
    public void shouldAddOrders() {
        //Given
        Shop.addOrder(one);
        Shop.addOrder(two);
        Shop.addOrder(three);

        //When
        int numberOfOrders = shop.getSize();

        //Then
        assertEquals(3, numberOfOrders);
    }

    @Test
    public void shouldGetOrderFromTwoYears() {
        //Given

        Shop.addOrder(one);
        Shop.addOrder(two);
        Shop.addOrder(three);

        //When
        Order result = shop.between(10.2020, 10.2018);

        //Then
        assertEquals("one", result.getDate());
        assertEquals("Mike Morus", result.getCustomerLogin());
    }

    @Test
    public void shouldGetMaxAndMinValue() {

        //Given
        Shop.addOrder(one);
        Shop.addOrder(two);
        Shop.addOrder(three);

        //When
      //  Order result = shop.getMaxMinValue();

        //Then
        ;
    }
    @Test
    public void shouldGetSize() {
        //Given
        shop.addOrder(one);
        Shop.addOrder(two);
        Shop.addOrder(three);

        //When
        shop.getSize();

        //then
        assertEquals(3, shop.getSize());
    }

    @Test
    public void shouldGetTotalValue() {
        //Given
        shop.addOrder(one);
        Shop.addOrder(two);
        Shop.addOrder(three);

        //When
        shop.
    }


}
