package ro.ase.csie.cts.g1085;

public class SimpleFactory {

    public static Notification getNotification(String type){
        Notification notification = null;
        switch (type){
            case "email": notification = new EmailNotification(); break;
            case "sms": notification = new SMSNotification(); break;
            case "push" : notification = new PushNotification(); break;
        }
        return notification;
    }

}
