package v2;

public class Torwart extends Spieler {
    double koerpergroesse;

    public Torwart(String name, double koerpergroesse) {
        super(name, "Torwart");
        this.koerpergroesse = koerpergroesse;
    }

    @Override
    public void spielen() {
        System.out.println(name + " steht im Tor und verteidigt! (Körpergröße: " + koerpergroesse + " m)");
    }
}
