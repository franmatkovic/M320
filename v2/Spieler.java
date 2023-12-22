package v2;

public class Spieler {
    String name;
    String position;

    public Spieler(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void spielen() {
        System.out.println(name + " spielt auf der Position " + position);
    }
}
