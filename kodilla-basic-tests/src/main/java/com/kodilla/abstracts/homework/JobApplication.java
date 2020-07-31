package com.kodilla.abstracts.homework;

import java.util.ArrayList;
import java.util.List;

public class JobApplication {
    public static void main(String[] args) {
        Job chef = new Chef();
        Job doctor = new Doctor();
        Job singer = new Singer();
        Job teacher = new Teacher();

        List<Job> jobList = new ArrayList<>();
        jobList.add(chef);
        jobList.add(doctor);
        jobList.add(singer);
        jobList.add(teacher);

        JobProcessor processor = new JobProcessor();

        for (Job job : jobList) {
            processor.process(job);
        }
    }
}
