package ase.cts.Memento;
//ceea ce vrem sa salvam-Memento
public class FileSnapshot {

    private String content;
    private String mesaj;

    //constr
    public FileSnapshot(String content,String mesaj) {
        this.content = content;
        this.mesaj=mesaj;
    }

    //METODE DE ACCES
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
