package v2;

public class Mittelfeldspieler extends Spieler {
    public Mittelfeldspieler(String name) {
        super(name, "Mittelfeldspieler");
    }

    @Override
    public void spielen() {
        System.out.println(name + " kontrolliert das Mittelfeld");
    }
}
