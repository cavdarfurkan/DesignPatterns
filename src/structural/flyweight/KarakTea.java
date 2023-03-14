package structural.flyweight;

public class KarakTea {

    private final String preference;

    public KarakTea(String preference) {
        this.preference = preference;
        System.out.println("Creating KarakTea: " + preference);
    }

    public String getPreference() {
        return preference;
    }
}
