package ro.ase.csie.cts.g1085.facade;

public class Pacient {
    public int stare;

    public void setStare(int stare){
        this.stare = stare;
    }
    public int getStare() {
        return stare;
    }

    public void verificaStare(){
        if(stare>5) {
            System.out.println("pacientul e in stare grava");
        }else{
            System.out.println("pacientul nu e in stare grava");
        }
    }
}
