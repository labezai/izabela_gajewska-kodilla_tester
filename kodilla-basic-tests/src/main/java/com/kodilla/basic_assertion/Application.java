package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int first  = 3;
        int second = 2;
        int sumResult = calculator.sum(a,b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if(correct) {
            System.out.println("Metoda sum dziala poprawnie dla liczb" + " " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb" + " " + a + " i " + b);
        }
        int subtractResult = calculator.subtract(a,b);
        boolean correct1 = ResultChecker.assertEquals(-3, subtractResult);
        if(correct1) {
            System.out.println("Metoda subtract dziala poprawnie dla liczb" + " " + a + " i " + b);
        }else{
            System.out.println("Metoda subtract nie dziala poprawnie dla liczb" + " " + a + " i " + b);
        }
        double powResult = Math.pow(first, second);
        boolean correct2 = ResultChecker.assertEquals(9,  powResult);
        if(correct2) {
            System.out.println("Metoda squared działa poprawnie dla liczb" + " " + first + " podniesiona do potęgi" + second );
        }else{
            System.out.println("Metoda squared nie działa poprawnie dla liczb" + " " + first + "podniesiona do potęgi " + second);
        }
    }
}
