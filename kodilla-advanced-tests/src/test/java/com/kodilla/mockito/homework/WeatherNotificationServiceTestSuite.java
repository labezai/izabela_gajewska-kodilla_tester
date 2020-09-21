package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherNotificationServiceTestSuite {

    @Test
    public void ShouldClientSignInAndReceiveNotification() {
//Osoba zainteresowana może zostać zapisana do danej lokalizacji, i zacznie otrzymywać powiadomienia.
        WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
        Client client = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);
        Location location = Mockito.mock(Location.class);

        weatherNotificationService.addSubscriber(client);
        weatherNotificationService.addLocation(location);
        weatherNotificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void ShouldClientDeleteLocationSubscription() {
//Można wycofać subskrypcję z danej lokalizacji.
        WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
        Client client = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);
        Location location = Mockito.mock(Location.class);

        weatherNotificationService.addSubscriber(client);
        weatherNotificationService.deleteLocation(location);
        weatherNotificationService.notSendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void ShouldClientStopReceivingNotifications() {
//Można wycofać subskrypcję ze wszystkich lokalizacji, co równa się kompletnemu wypisaniu klienta z powiadomień.
        WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
        Client client = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);
        Location location = Mockito.mock(Location.class);

        weatherNotificationService.cancelSubscriber(client);
        weatherNotificationService.deleteAllLocations(location);
        weatherNotificationService.notSendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void ShouldSpecificGroupOfClientsGetNotification() {
//Powiadomienie dla osób w danej lokalizacji powinno dotrzeć tylko do określonej grupy osób.
        WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
        Client client = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);
        Location location = Mockito.mock(Location.class);

        weatherNotificationService.sendToGroupOdSubscribers(client);
        weatherNotificationService.sendToSubscribers(location);
        weatherNotificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void ShouldAllSubscribersGetNotification() {
//Możliwość wysyłki powiadomienia do wszystkich.
        WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
        Client client = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);
        Location location = Mockito.mock(Location.class);

        weatherNotificationService.sendToAllSubscribers(client);
        weatherNotificationService.sendToSubscribers(location);
        weatherNotificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void ShouldBeAbleToDeleteCurrentLocation() {
        //Możliwość skasowania danej lokalizacji.
        WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
        Client client = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);
        Location location = Mockito.mock(Location.class);

        weatherNotificationService.notChangeSubscriberStatus(client);
        weatherNotificationService.cancelLocation(location);
        weatherNotificationService.notSendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }
}
