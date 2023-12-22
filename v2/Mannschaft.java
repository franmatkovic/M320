package v2;

import java.util.ArrayList;
import java.util.List;

public class Mannschaft {
    List<Spieler> spieler = new ArrayList<>();

    public void spielerHinzufuegen(Spieler spieler) {
        this.spieler.add(spieler);
    }

    public void teamSpielen() {
        for (Spieler spieler : this.spieler) {
            spieler.spielen();
        }
    }
}
