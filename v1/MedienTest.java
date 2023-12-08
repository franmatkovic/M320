package v1;

import java.util.ArrayList;
import java.util.List;

public class MedienTest {
    public static void main(String[] args) {
        List<Medien> medienListe = new ArrayList<>();

        medienListe.add(new DVD("Film-DVD", 2022, 19.99, 120));
        medienListe.add(new CD("Musik-CD", 2020, 14.99, "BandXYZ"));
        medienListe.add(new Buch("Buch-Titel", 2018, 29.99, "ISBN123456"));

        System.out.println("Alle Medien in der Liste:");
        for (Medien medium : medienListe) {
            medium.anzeigen();
            System.out.println("-------------");
        }

        medienListe.remove(0);

        System.out.println("Liste nach Entfernen eines Mediums:");
        for (Medien medium : medienListe) {
            medium.anzeigen();
            System.out.println("-------------");
        }
    }
}