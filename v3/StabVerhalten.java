package v3;

public class StabVerhalten implements WaffeVerhalten {
    @Override
    public void kaempfen() {
        System.out.println("Schwingt den Stab.");
    }
}