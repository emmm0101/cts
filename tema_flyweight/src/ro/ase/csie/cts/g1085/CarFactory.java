package ro.ase.csie.cts.g1085;

import java.util.HashMap;

public class CarFactory {
    private static HashMap<String, Car> listaMasini;

    public CarFactory() {
        listaMasini = new HashMap<String, Car>();
    }

    public static ICar getCar(String color){
        if (listaMasini.containsKey(color))
            return listaMasini.get(color);
        else
        {
            ICar car = new Car(color);
            listaMasini.put(color, (Car)car);
            return car;
        }
    }
}
