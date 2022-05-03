package ro.ase.csie.cts.g1085.facade;

public class EmitatorFisa {
    int zi;

    public int getZi() {
        return zi;
    }

    public void setZi(int zi) {
        this.zi = zi;
    }

    public void emitereFisa(){
        System.out.println("fisa emisa la data de " + zi);
    }
}
