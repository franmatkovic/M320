package v3;

public abstract class Figur {
    protected WaffeVerhalten waffeVerhalten;
 
    public Figur(WaffeVerhalten waffeVerhalten) {
        this.waffeVerhalten = waffeVerhalten;
    }
 
    public void setWaffeVerhalten(WaffeVerhalten wv) {
        this.waffeVerhalten = wv;
    }
 
    public void kaempfen() {
        waffeVerhalten.kaempfen();
    }
    public void display() {
        System.out.println("figur");
    }
}