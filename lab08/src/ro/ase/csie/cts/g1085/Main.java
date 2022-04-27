package ro.ase.csie.cts.g1085;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MasinaSimpla masinaSimpla = new MasinaSimpla();
        masinaSimpla.pornesteMotor();
        System.out.println("/////////");
        MasinaSuper masinaSuper = new MasinaSuper(masinaSimpla);
        masinaSuper.pornesteMotor();

    }
}
