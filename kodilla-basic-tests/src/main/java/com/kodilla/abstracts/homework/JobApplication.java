package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Job chef = new Chef();
        Job doctor = new Doctor();
        Job singer = new Singer();
        Job teacher = new Teacher();

        JobProcessor processor = new JobProcessor();
        processor.process(chef);

        JobProcessor processor1 = new JobProcessor();
        processor1.process(singer);

        JobProcessor processor2 = new JobProcessor();
        processor2.process(doctor);

        JobProcessor processor3 = new JobProcessor();
        processor3.process(teacher);
    }
}
