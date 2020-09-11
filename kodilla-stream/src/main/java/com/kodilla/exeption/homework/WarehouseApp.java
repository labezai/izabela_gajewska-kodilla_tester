package com.kodilla.exeption.homework;

public class WarehouseApp {


    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        warehouse.addOrder(new Order("5"));
        warehouse.addOrder(new Order("6"));
        warehouse.addOrder(new Order("7"));
        warehouse.addOrder(new Order("8"));
        warehouse.addOrder(new Order("9"));
        warehouse.addOrder(new Order("10"));

        try{
            System.out.println(warehouse.getOrder("11").getNumber());
        } catch (OrderDoesntExistException e){
            System.out.println("I can't find this order.");
        }
        }
    }
    //o