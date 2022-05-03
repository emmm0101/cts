package ro.ase.csie.cts.g1085;

import java.util.ArrayList;
import java.util.List;

public class AgentieTurism {
    private String locatie;
    private int nrAngajati;
    private String denumire;
    private List<Serviciu> servicii;
    private List<Client> clienti;
    private static AgentieTurism instance= null;

    public static synchronized AgentieTurism getInstance(String locatie, int
            nrAngajati,String denumire,List<Serviciu> servicii,List<Client> clienti){

        if(instance==null){
            instance = new AgentieTurism( locatie,  nrAngajati, denumire, servicii,clienti);
        }
        return instance;
    }

    public static synchronized AgentieTurism getInstance(){
        return instance;
    }


    private AgentieTurism(String locatie, int nrAngajati,String denumire,
                          List<Serviciu> servicii,List<Client> clienti){
        if(locatie.length()>0)
            this.locatie = locatie;
        if(nrAngajati>0)
            this.nrAngajati = nrAngajati;
        if(denumire.length()>5)
            this.denumire = denumire;
        this.servicii = servicii;
        this.clienti = clienti;
    }

    public List<Client> getClienti() {
        return clienti;
    }

    public void setClienti(List<Client> clienti) {
        this.clienti = clienti;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        if(locatie.length()>0)
            this.locatie = locatie;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        if(nrAngajati>0)
            this.nrAngajati = nrAngajati;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        if(denumire.length()>5)
            this.denumire = denumire;
    }

    public List<Serviciu> getServicii() {
        return servicii;
    }

    public void setServicii(List<Serviciu> servicii) {
        this.servicii = servicii;
    }

    @Override
    public String toString() {
        return "AgentieTurism{" +
                "locatie='" + locatie + '\'' +
                ", nrAngajati=" + nrAngajati +
                ", denumire='" + denumire + '\'' +
                ", servicii=" + servicii +
                ", clienti=" + clienti +
                '}';
    }
}