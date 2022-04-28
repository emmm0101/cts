package ro.ase.cts.gr1085.lab09;

public class Main {
    public static void main(String[] args){
        IAngajat iAngajat1 = new Manager("Manager1", " 22");
        IAngajat iAngajat2 = new Manager("Manager3", " 33");
        IAngajat iAngajat3 = new Manager("Manager2", " 44");
        iAngajat1.adaugareSubordonat(new Angajat("Marin", "11"));
        iAngajat1.adaugareSubordonat(new Angajat("Coco", "12"));
        iAngajat1.adaugareSubordonat(new Angajat("Marina", "13"));
        iAngajat2.adaugareSubordonat(new Angajat("Alin", "14"));
        iAngajat2.adaugareSubordonat(new Angajat("Alina", "15"));
        iAngajat2.adaugareSubordonat(new Angajat("Alinel", "16"));
        iAngajat3.adaugareSubordonat(new Angajat("Marinel", "17"));
        iAngajat3.adaugareSubordonat(new Angajat("Mari", "18"));
        iAngajat3.adaugareSubordonat(new Angajat("Maria", "19"));

    }
}
