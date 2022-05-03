package ro.ase.csie.cts.g1085.facade;

public class Facade {
    MonitorSaloane monitorSaloane;
    EmitatorFisa emitatorFisa;
    Pacient pacient;

    public Facade() {
        this.monitorSaloane = new MonitorSaloane();
        this.emitatorFisa = new EmitatorFisa();
        this.pacient = new Pacient();
    }

    public void internarePacient(int stare,int nr, int zi){
        pacient.setStare(stare);
        emitatorFisa.setZi(zi);

        pacient.verificaStare();
        monitorSaloane.ocupaSalon(nr);
        emitatorFisa.emitereFisa();

    }

}
