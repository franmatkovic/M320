package v3;

public class DolchVerhalten implements WaffeVerhalten {
    @Override
    public void kaempfen() {
        System.out.println("Sticht mit dem Dolch.");
    }
}