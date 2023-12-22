package v2;

public class Stuermer extends Spieler {
    public Stuermer(String name) {
        super(name, "Stürmer");
    }

    @Override
    public void spielen() {
        System.out.println(name + " greift das Tor an!");
    }
}
