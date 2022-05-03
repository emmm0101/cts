package ro.ase.csie.cts.g1085;

public class Main {

    public static void main(String[] args) {
        Notification notification = SimpleFactory.getNotification("sms");
        notification.notifyUser();
        Notification notification2 = SimpleFactory.getNotification("email");
        notification2.notifyUser();
    }
}
