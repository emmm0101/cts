package ro.ase.csie.cts.g1085;

public abstract class Decorator implements IMasina{
    IMasina masina;

    public Decorator(IMasina masina){
        this.masina = masina;
    }

    @Override
    public void pornesteMotor(){
        masina.pornesteMotor();
    }


}
