package ro.ase.csie.cts.g1085.facade;

public class MonitorSaloane {
    int[] saloane = new int[10];

    public void ocupaSalon(int nr){
        if(saloane[nr] == 0){
            saloane[nr] = 1;
            System.out.println("salonul a fost ocupat");
        }else{
            System.out.println("salonul este ocupat");
        }
    }

    public void elibereazaSalon(int nr){
        saloane[nr] = 0;
    }


    public int getSaloaneDisponibile(){
        int nr=0;
        for(int i:saloane){
            if(i==0) {
                nr += 1;
            }
        }
        return nr;
    }

}
