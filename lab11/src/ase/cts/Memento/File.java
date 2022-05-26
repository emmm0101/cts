package ase.cts.Memento;

import java.util.logging.FileHandler;

public class File {

    private String mesaj;
    private String continutFis;
    private String denumire;
    private int id;

    //constructor
    public File(String continutFis, String denumire, int id) {
        this.continutFis = continutFis;
        this.denumire = denumire;
        this.id = id;
    }

    //SET+GET

    public String getContinutFis() {
        return continutFis;
    }
    public void setContinutFis(String continutFis) {
        this.continutFis = continutFis;
    }
    public String getDenumire() {
        return denumire;
    }
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //metoda care creeza un ob de tip FileSnapshot
    public FileSnapshot createSnapshot(String continutFis){
        return new FileSnapshot(this.continutFis,this.mesaj);
    }

    //metoda care restaureaza versiunea anterioara
    public void restoreFileContent(FileSnapshot fSnap){
         this.continutFis=fSnap.getContent();
    }



}
