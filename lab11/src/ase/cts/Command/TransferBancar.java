package ase.cts.Command;

public class TransferBancar implements OperatiuneBancara_command {

    private ServerOperatiuniBancare server;
    //constr
    public TransferBancar(ServerOperatiuniBancare server) {
        this.server = server;
    }

    @Override
    public void efectuareOperatiune() {
        server.transferaDinCont();
    }
}
