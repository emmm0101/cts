package ro.ase.csie.cts.g1085;

public class Copac implements Cloneable{
    float inatlime;
    String culoareFrunze;
    String coroana;
    Pozitie xoy;

    public Copac(float inatlime, String culoareFrunze, String coroana, Pozitie xoy) {
        this.inatlime = inatlime;
        this.culoareFrunze = culoareFrunze;
        this.coroana = coroana;
        this.xoy = xoy;
    }

    public float getInatlime() {
        return inatlime;
    }

    public void setInatlime(float inatlime) {
        this.inatlime = inatlime;
    }

    public String getCuloareFrunze() {
        return culoareFrunze;
    }

    public void setCuloareFrunze(String culoareFrunze) {
        this.culoareFrunze = culoareFrunze;
    }

    public String getCoroana() {
        return coroana;
    }

    public void setCoroana(String coroana) {
        this.coroana = coroana;
    }

    public Pozitie getXoy() {
        return xoy;
    }

    public void setXoy(Pozitie xoy) {
        this.xoy = xoy;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;

    }
}
