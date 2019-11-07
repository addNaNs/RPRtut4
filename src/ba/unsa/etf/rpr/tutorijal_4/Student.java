package ba.unsa.etf.rpr.tutorijal_4;

public class Student {
    private String ime, prezime;
    private Raspored ras;

    public Student(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public Student(String ime, String prezime, Semestar sem) throws Throwable {
        this.ime = ime;
        this.prezime = prezime;
        upisiSemestar(sem);
    }

    public Student(String ime, String prezime, Semestar sem, int[] izborni_sifre) throws Throwable {
        this.ime = ime;
        this.prezime = prezime;
        upisiSemestar(sem, izborni_sifre);
    }

    public void upisiSemestar(Semestar sem) throws Throwable {
        upisiSemestar(sem, new int[0]);
    }

    public void upisiSemestar(Semestar sem, int[] izborni_sifre) throws Throwable {
        ras = new Raspored(sem, izborni_sifre);

        for (Predmet predmet : ras.getPredmets()) {
            predmet.upisi(this);
        }

    }
}
