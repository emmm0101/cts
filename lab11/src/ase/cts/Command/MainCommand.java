package ase.cts.Command;

public class MainCommand {
    public static void main(String[] args) {

        ManagerBancar manager= new ManagerBancar();//gestioneaza operatiuni
        ServerOperatiuniBancare server=new ServerOperatiuniBancare();

        BlocareCont blocare= new BlocareCont(server);
        TransferBancar transfer=new TransferBancar(server);

        manager.inserareOperatiune(blocare);
        manager.inserareOperatiune(transfer);

        manager.trimitereOperatiune();
        manager.inserareOperatiune(transfer);
        manager.trimitereOperatiune();



    }
}
