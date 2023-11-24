public class Heizung {
    private int temperature;
    private int min;
    private int max;
    private int increment;

    public Heizung(int initialTemperature, int increment) {
        this.temperature = initialTemperature;
        this.min = 10;
        this.max = 25;
        this.increment = increment;
    }

    public void waermerMachen() {
        if (temperature + increment <= max) {
            temperature += increment;
            System.out.println("Temperatur erhöht auf: " + temperature);
        } else {
            System.out.println("Maximale Temperatur erreicht.");
        }
    }

    public void kaelterMachen() {
        if (temperature - increment >= min) {
            temperature -= increment;
            System.out.println("Temperatur gesenkt auf: " + temperature);
        } else {
            System.out.println("Minimale Temperatur erreicht.");
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public static void main(String[] args) {
        Heizung heizung1 = new Heizung(20, 5);

        heizung1.waermerMachen();
        heizung1.kaelterMachen();
        heizung1.waermerMachen();
        heizung1.waermerMachen();

        System.out.println("Aktuelle Temperatur: " + heizung1.getTemperature());
    }
}
