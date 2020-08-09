package com.kodilla.collections.adv.immutable.special.homework;


public class BookApplication {
    public static void main(String[] args) {
        new BookManager("J.K.Rowling", "Harry Potter");
        new BookManager("Sywlia Wilczyńska","Topielice");
        new BookManager("Bracia Grimm","Baśnie tysiąca i jednej nocy");
        new BookManager("J.K.Rowling", "Harry Potter");
        System.out.println("J.K.Rowling" == "Sywlia Wilczyńska");
        System.out.println("J.K.Rowling".equals("Sylwia Wilczyńska"));
        System.out.println("-----------------");
        System.out.println("J.K.Rowling" == "J.K.Rowling");
        System.out.println("J.K.Rowling".equals("J.K.Rowling"));
        System.out.println("-----------------");
        System.out.println("Sylwia Wilczyńska" == "Bracia Grimm");
        System.out.println("Sywlia Wilczyńska".equals("Bracia Grimm"));
        System.out.println("-----------------");
        System.out.println("Bracia Grimm" == "J.K.Rowling");
        System.out.println("Bracia Grimm".equals("J.K.Rowling"));
        System.out.println("-----------------");
    }
}
