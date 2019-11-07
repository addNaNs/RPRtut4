package ba.unsa.etf.rpr.tutorijal_4;

import java.util.Set;

public class Predmet {
    private String naziv="";
    private int sifra=-1;
    private  int etcs=-1;
    private Set<Student> upisani;

    public Predmet(String naziv, int sifra, int etcs){
        this.naziv = naziv;
        this.sifra = sifra;
        this.etcs = etcs;
    }

    public void upisi(Student s){
        upisani.add(s);
    }

    public String getNaziv() {
        return naziv;
    }

    public int getEtcs() {
        return etcs;
    }

    public int getSifra() {
        return sifra;
    }
}
