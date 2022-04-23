package ro.ase.csie.cts.g1085;

public class MasinaJucarie implements JucarieMobila{
    @Override
    public void seDeplaseaza() {
        System.out.println("viteza 0.01 km/h");
    }

    @Override
    public void emiteSunete() {
        System.out.println("canta melodie");
    }
}
