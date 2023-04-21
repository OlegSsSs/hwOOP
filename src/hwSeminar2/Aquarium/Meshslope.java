package hwSeminar2.Aquarium;

public class Meshslope extends Unusualfish implements Volumeable, Temperatureable, Hardnesswaterable {

    public Meshslope(String name) {
        super(name);
    }

    @Override
    public int temperatureaqarium() {
        return 24;
    }

    @Override
    public int volumeAqarium() {
        return 600;
    }

    @Override
    public int hardnesswaterable() {
        return 8;
    }
}
