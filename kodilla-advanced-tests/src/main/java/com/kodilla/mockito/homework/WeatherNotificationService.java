package com.kodilla.mockito.homework;

public class WeatherNotificationService {

    private Client client;
    private Location location;
    private Notification notification;


    public void addSubscriber(Client client) {
        this.client = client;

    }

    public void sendNotification(Notification notification) {
        this.client.receive(notification);

    }

    public void cancelSubscriber(Client client) {

    }

    public void notSendNotification(Notification notification) {

    }

    public void addLocation(Location location) {
        this.client.subscribes(location);

    }

    public void deleteLocation(Location location) {
        this.client.notSubscribes(location);

    }

    public void deleteAllLocations(Location location) {

    }

    public void sendToGroupOdSubscribers(Client client) {
        this.client = client;


    }

    public void sendToSubscribers(Location location) {
        this.client.subscribes(location);

    }

    public void sendToAllSubscribers(Client client) {
        this.client = client;
    }

    public void cancelLocation(Location location) {
        this.client.notSubscribes(location);
    }

    public void notChangeSubscriberStatus(Client client) {
        this.client = client;
    }
}
