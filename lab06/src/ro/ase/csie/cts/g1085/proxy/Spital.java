package ro.ase.csie.cts.g1085.proxy;

public class Spital implements ISpital {
    String denumire;

    public Spital(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void interneazaPacient(boolean areAsigurare){
        System.out.println("pacientul a fost internat");
    }
}
