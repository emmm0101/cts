package ro.ase.csie.cts.g1085;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        ICar yellowCar = factory.getCar("yellow"); yellowCar.setSpeed(50);
        ICar redCar = factory.getCar("red"); redCar.setSpeed(40);
        ICar yellowCar1 = factory.getCar("yellow"); yellowCar1.setSpeed(30);

        yellowCar.carStatus(); // also shows 30 because we modified the original object
        redCar.carStatus();
        yellowCar1.carStatus();

    }
}
