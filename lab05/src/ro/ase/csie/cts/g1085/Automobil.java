package ro.ase.csie.cts.g1085;

public class Automobil {
    String sasiu;
    String producator;

    public Automobil(String sasiu, String producator) {
        this.sasiu = sasiu;
        this.producator = producator;
    }

    public String getSasiu() {
        return sasiu;
    }

    public String getProducator() {
        return producator;
    }
}
