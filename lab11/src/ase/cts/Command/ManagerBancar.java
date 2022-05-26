package ase.cts.Command;

import java.util.ArrayList;
import java.util.List;
//gestioneaza operatiunile bancare
public class ManagerBancar {

    private List<OperatiuneBancara_command> listaOperatiuneBanc=new ArrayList<>();

    //Gestiunea comenzilor--adaugare in lista
    public void inserareOperatiune(OperatiuneBancara_command operatiune){
        listaOperatiuneBanc.add(operatiune);
    }

    public void stergereOperatiune(OperatiuneBancara_command operatiuneDeSters){
        listaOperatiuneBanc.remove((operatiuneDeSters));
    }

    //transmitere operatiune pt a fi procesata
    public void trimitereOperatiune(){
        for(OperatiuneBancara_command op:listaOperatiuneBanc)
        {
            op.efectuareOperatiune();
            stergereOperatiune(op);
        }
    }


}
