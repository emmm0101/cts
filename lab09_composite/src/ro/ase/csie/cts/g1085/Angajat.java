package ro.ase.csie.cts.g1085;

public class Angajat implements NodIerarhie{
    int salariu;
    String nume;

    public Angajat(String nume,int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public void adaugaNod(NodIerarhie nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void scoateNod(NodIerarhie nod) {
        throw new UnsupportedOperationException();
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
