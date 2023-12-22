package v2;

public class FussballHierarchie {
    public static void main(String[] args) {
        Mannschaft team = new Mannschaft();

        Torwart torwart = new Torwart("Manuel Neuer", 1.93);
        Verteidiger verteidiger = new Verteidiger("Mats Hummels");
        Mittelfeldspieler mittelfeldspieler = new Mittelfeldspieler("Toni Kroos");
        Stuermer stuermer = new Stuermer("Robert Lewandowski");

        team.spielerHinzufuegen(torwart);
        team.spielerHinzufuegen(verteidiger);
        team.spielerHinzufuegen(mittelfeldspieler);
        team.spielerHinzufuegen(stuermer);

        team.teamSpielen();
    }
}
