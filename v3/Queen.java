package v3;

public class Queen extends Character {
    public Queen() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void display() {
        System.out.println("Königin");
    }
}