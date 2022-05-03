package ro.ase.csie.cts.g1085.proxy;

public class Proxy implements ISpital{
    ISpital spital;

    public Proxy(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void interneazaPacient(boolean areAsigurare) {
        if(areAsigurare){
            spital.interneazaPacient(areAsigurare);
        }else{
            System.out.println("nu are asigurare");
        }

    }
}
