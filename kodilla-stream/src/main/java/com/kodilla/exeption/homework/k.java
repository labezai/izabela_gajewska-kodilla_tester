package com.kodilla.exeption.homework;

import java.util.Scanner;

public class k {
    public static int getOrderNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter order number");
            String s = scanner.nextLine();
            try {
                int orders = Integer.parseInt(s);
                return orders;
            } catch (Exception e) {
                System.out.println("That order does not exist. If you need to find another order try again.");
            }
        }
    }
}
