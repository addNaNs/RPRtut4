package ba.unsa.etf.rpr.tutorijal_4;

import java.util.ArrayList;

public class Semestar {
    private String naziv;
    private ArrayList<Predmet> obavezni, izborni;
    private Throwable IllegalArgumentException;

    Semestar(Predmet[] obavazni, Predmet[] izborni){
        for(Predmet predmet : obavazni) {
            this.obavezni.add(predmet);
        }

        for (Predmet predmet : izborni) {
            this.izborni.add(predmet);
        }
    }

    public Semestar() {
    }

    public String getNaziv() {
        return naziv;
    }

    public ArrayList<Predmet> getObavezni() {
        return obavezni;
    }

    public ArrayList<Predmet> getIzborni() {
        return izborni;
    }

    public Predmet getSaSifrom(int i) throws Throwable {
        for (Predmet predmet : izborni) {
            if(predmet.getSifra()==i) return predmet;
        }

        throw IllegalArgumentException;

    }
}
