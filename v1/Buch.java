package v1;

public class Buch extends Medien {
    private String isbn;

    public Buch(String titel, int jahr, double preis, String isbn) {
        super(titel, jahr, preis);
        this.isbn = isbn;
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println("ISBN: " + isbn);
    }

    public String getIsbn() {
        return isbn;
    }
}