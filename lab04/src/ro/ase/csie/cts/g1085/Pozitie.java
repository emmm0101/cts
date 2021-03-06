package ro.ase.csie.cts.g1085;

public class Pozitie implements Cloneable {
    int x;
    int y;

    public Pozitie(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pozitie clone =(Pozitie)  super.clone();
        clone.x = this.x;
        clone.y = this.y;
        return clone;
    }
}
