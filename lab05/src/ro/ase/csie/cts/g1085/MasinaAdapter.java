package ro.ase.csie.cts.g1085;

public class MasinaAdapter implements JucarieMobila {
    Masina masina;

    public void MasinaAdapter(Masina masina){
        this.masina = masina;
    }

    @Override
    public void seDeplaseaza() {
        masina.ruleaza();
    }

    @Override
    public void emiteSunete() {
        masina.claxoneaza();
    }
}
