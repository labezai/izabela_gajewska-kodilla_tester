package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> host = new HashMap<>();
        Principal maciej = new Principal("Maciej", "Sokolnik","III LO");
        Principal anna = new Principal("Anna", "Koza", "1 LO");
        Principal marcin = new Principal("Marcin", "Baran", "ZS5");
        Principal joanna = new Principal("Joanna", "Orzel","II LO");

        School maciejSchool = new School (20.0, 16.0, 28.0, 26.0);
        School annaSchool = new School (30.0, 19.0, 32.0);
        School marcinSchool = new School(29.0, 26.0, 18.0);
        School joannaSchool = new School(35.0, 19.0, 29.0, 14.0, 31.0, 33.0);

        host.put(maciej, maciejSchool);
        host.put(anna, annaSchool);
        host.put(marcin, marcinSchool);
        host.put(joanna, joannaSchool);

        System.out.println(host.get(anna));

        for (Map.Entry<Principal, School> principalEntry : host.entrySet())
            System.out.println(principalEntry.getKey().getFirstName() +" "+ principalEntry.getKey().getLastname() +" " +"is a principal of " +
                    principalEntry.getKey().getSchoolname() +". The total number of students in this school is: "+" "+ principalEntry.getValue().getAverage());



    }
}
