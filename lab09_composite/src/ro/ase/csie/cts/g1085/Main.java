package ro.ase.csie.cts.g1085;

public class Main {

    public static void main(String[] args) {
	    Angajat angajat1 = new Angajat("Aurel",2000 );
        Angajat angajat2 = new Angajat("Aurica",2000 );

        Manager manager = new Manager("Gelu", 3000);
        manager.adaugaNod(angajat1);
        manager.adaugaNod(angajat2);

        try{
            angajat1.scoateNod(angajat2);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
