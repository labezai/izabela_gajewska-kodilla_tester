package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;
import org.w3c.dom.ls.LSOutput;

public class ForumStats {
    public static void main(String[] args) {
        double avg = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Średnia liczba postów dla użytkowników w wieku 40+ to " + avg);

        double avg1 = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Średnia liczba postów dla użytkowników w wieku <40 to " + avg1);

    }
}
