package ro.ase.csie.cts.g1085.proxy;

public class Main {

    public static void main(String[] args) {
        Spital spital = new Spital("Marie Curie");
        spital.interneazaPacient(false);
        Proxy proxy = new Proxy(spital);
        proxy.interneazaPacient(false);
    }
}
