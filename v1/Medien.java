package v1;

public class Medien {
    private String titel;
    private int jahr;
    private double preis;

    public Medien(String titel, int jahr, double preis) {
        this.titel = titel;
        this.jahr = jahr;
        this.preis = preis;
    }

    public String getTitel() {
        return titel;
    }

    public int getJahr() {
        return jahr;
    }

    public double getPreis() {
        return preis;
    }

    public void anzeigen() {
        System.out.println("Titel: " + titel);
        System.out.println("Jahr: " + jahr);
        System.out.println("Preis: " + preis);
    }
}