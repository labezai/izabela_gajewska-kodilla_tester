package com.kodilla.optional.homework;


import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kasia", new Teacher("Basia")));
        students.add(new Student("Maciej", null));
        students.add(new Student("Krysia", new Teacher("Aldona")));
        students.add(new Student("Kamil", null));
        students.add(new Student("Bartek", null));
        students.add(new Student("Gabriel", new Teacher("Konstancja")));
        students.add((new Student("Piotr", new Teacher("Anna"))));

        for(Student student: students)
            System.out.println("Uczeń: " + student.getName() + " Nauczyciel: " + student.getTeacher().getName() );
    }
}