package ro.ase.csie.cts.g1085;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("you ve got mail!!!");
    }
}
