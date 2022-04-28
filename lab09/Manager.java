package ro.ase.cts.gr1085.lab09;

import java.util.ArrayList;
import java.util.List;

public class Manager implements IAngajat{
    private String nume;
    private String codAngajat;
    private List<IAngajat> iAngajats = new ArrayList<IAngajat>();

    public Manager(String nume, String codAngajat){
        this.nume = nume;
        this.codAngajat = codAngajat;
    }


    @Override
    public void afisareDetalii() {
        System.out.println("manager nume: " + nume + " cod angajat " + codAngajat);
        for (IAngajat iAngajat: iAngajats) {
            iAngajat.afisareDetalii();
        }
    }

    @Override
    public void adaugareSubordonat(IAngajat iAngajat) {
        if(!iAngajats.contains(iAngajat)){
            iAngajats.add(iAngajat);
        }
    }

    @Override
    public void stergereSubordonat(IAngajat iAngajat) {
        if(!iAngajats.contains(iAngajat)){
            iAngajats.remove(iAngajat);
        }
    }
}
