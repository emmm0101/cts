package ro.ase.csie.cts.g1085;

public class AutoturismBuilder extends Automobil implements Builder{

    public AutoturismBuilder(String sasiu, String producator) {
        super(sasiu, producator);
    }


    @Override
    public void buildSasiu() {
        sasiu = "mic";
    }

    @Override
    public void buildProducator() {
        producator = "";
    }

    @Override
    public Automobil getAutomobil() {
        return null;
    }
}
