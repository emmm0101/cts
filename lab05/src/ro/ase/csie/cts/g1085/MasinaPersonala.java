package ro.ase.csie.cts.g1085;

public class MasinaPersonala implements Masina{

    @Override
    public void ruleaza() {
        System.out.println("viteza 100");
    }

    @Override
    public void claxoneaza() {
        System.out.println("sunet strident");
    }
}
