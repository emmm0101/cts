package ro.ase.csie.cts.g1085;

import java.util.ArrayList;
import java.util.List;

public class Departament implements NodIerarhie{
    String denumire;
    List<NodIerarhie> listaSuperiori = new ArrayList<>();

    public Departament(int salariu, List<Angajat> lista) {
        for(NodIerarhie nod : lista){
            listaSuperiori.add(nod);
        }
    }

    @Override
    public void adaugaNod(NodIerarhie nod) {
        listaSuperiori.add(nod);
    }

    @Override
    public void scoateNod(NodIerarhie nod) {
        listaSuperiori.remove(nod);
    }

    @Override
    public void cautaNod(NodIerarhie nod) {
        NodIerarhie nodGasit = (NodIerarhie) listaSuperiori.stream().filter(e -> e.getNume() == nod.getNume());
        System.out.println("Am gasit angajatul/managerul: " + nod.getNume());
    }

    @Override
    public int getSalariu() {
        int sum=0;
        for (int i = 0; i < listaSuperiori.size(); i++)
            sum += listaSuperiori.get(i).getSalariu();
        return sum;
    }

    @Override
    public String getNume() {
        return denumire;
    }

}
