package ro.ase.csie.cts.g1085;

public class Car implements ICar {

    private final String color;
    private int speed;

    public Car(String color) {
        this.color = color;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void carStatus() {
        System.out.println("I am the" + " " + this.color + " car " + "and I have the following hash code" + " " + this.hashCode());
        System.out.println("Also I m going this fast: " + this.speed + " km/h");
    }
}
