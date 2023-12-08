package v1;

public class DVD extends Medien {
    private int filmLaenge;

    public DVD(String titel, int jahr, double preis, int filmLaenge) {
        super(titel, jahr, preis);
        this.filmLaenge = filmLaenge;
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println("Film Länge: " + filmLaenge);
    }

    public int getFilmLaenge() {
        return filmLaenge;
    }
}