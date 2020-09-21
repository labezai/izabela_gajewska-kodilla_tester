package com.kodilla.mockito.homework;

public interface Client {

    void receive(Notification notification);

    void subscribes(Location location);

    void notSubscribes(Location location);
}
