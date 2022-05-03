package ro.ase.csie.cts.g1085;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Copac copac = new Copac(7, "verde", "mare", new Pozitie(1,1));
        Copac copac2 =(Copac) copac.clone();
        copac2.xoy.x = 2;
        copac2.xoy.y = 2;

    }
}
