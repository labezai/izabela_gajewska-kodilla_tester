package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("beach", 2, "no"));
        stamps.add(new Stamp("desert", 2, "yes"));
        stamps.add(new Stamp("gold fish",3, "no"));
        stamps.add(new Stamp("rose", 4, "no"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);



    }
}
