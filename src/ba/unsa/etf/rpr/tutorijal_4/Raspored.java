package ba.unsa.etf.rpr.tutorijal_4;

import java.util.ArrayList;

public class Raspored {
    ArrayList<Predmet> predmets;

    Raspored(Semestar sem, int[] izborni_sifre) throws Throwable {
        for (Predmet predmet : sem.getObavezni()) {
            predmets.add(predmet);
        }

        for (int i : izborni_sifre) {
            predmets.add(sem.getSaSifrom(i));
        }

    }

    public ArrayList<Predmet> getPredmets() {
        return predmets;
    }
}
