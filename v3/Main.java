package v3;

import java.util.ArrayList;
import java.util.List;
 
public class Main {
    public static void main(String[] args) {
        List<Figur> figuren = new ArrayList<>();
 
        // Instantiate specific characters
        Figur axtKaempfer = new AxtKaempfer();
        Figur dolchKaempfer = new DolchKaempfer();
        Figur stabMagier = new StabMagier();
        // Add characters to the list
        figuren.add(axtKaempfer);
        figuren.add(dolchKaempfer);
        figuren.add(stabMagier);
 
        // Demonstrate each character with their default weapon behavior
        for (Figur figur : figuren) {
            figur.
            figur.kaempfen();
        }
    }
}














