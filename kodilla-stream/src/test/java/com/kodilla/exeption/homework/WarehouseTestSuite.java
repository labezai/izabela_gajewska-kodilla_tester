package com.kodilla.exeption.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarehouseTestSuite {

    @Test
    public void testGetOrder_withException() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("12"));
        warehouse.addOrder(new Order("14"));
        warehouse.addOrder(new Order("198"));
        warehouse.addOrder(new Order("147"));
        Order doesOrderExist= warehouse.getOrder("329865346890y642");
        assertEquals(new Order("12"), doesOrderExist);
        assertEquals(1,2);
    }
}
