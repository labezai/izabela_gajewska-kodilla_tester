package com.kodilla.exeption.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarehouseTestSuite {

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrder_withException() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        Order doesOrderExist= warehouse.getOrder("32");
        assertEquals(false, doesOrderExist);
    }
}
