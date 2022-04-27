package ro.ase.csie.cts.g1085;

public class MasinaSuper extends Decorator{

    public MasinaSuper(IMasina masina){
        super(masina);
    }

    @Override
    public void pornesteMotor() {
        super.pornesteMotor();
        System.out.println("sunt si super");
    }
}
