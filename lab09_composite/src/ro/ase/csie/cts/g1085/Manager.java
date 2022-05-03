package ro.ase.csie.cts.g1085;

import java.util.ArrayList;
import java.util.List;

public class Manager implements NodIerarhie{
    int salariu;
    String nume;
    List<NodIerarhie> angajati = new ArrayList<>();

    public Manager(String nume,int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public void adaugaNod(NodIerarhie nod) {
        angajati.add(nod);
    }

    @Override
    public void scoateNod(NodIerarhie nod) {
        angajati.remove(nod);
    }

    @Override
    public void cautaNod(NodIerarhie nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getSalariu() {
        return salariu;
    }

    @Override
    public String getNume() {
        return nume;
    }
}
