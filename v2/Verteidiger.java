package v2;

public class Verteidiger extends Spieler {
    public Verteidiger(String name) {
        super(name, "Verteidiger");
    }

    @Override
    public void spielen() {
        System.out.println(name + " verteidigt die Position als Verteidiger");
    }
}
