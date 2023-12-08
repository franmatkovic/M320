package v1;

public class CD extends Medien {
    private String bandName;

    public CD(String titel, int jahr, double preis, String bandName) {
        super(titel, jahr, preis);
        this.bandName = bandName;
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println("Band Name: " + bandName);
    }

    public String getBandName() {
        return bandName;
    }
}