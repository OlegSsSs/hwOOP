package hwSeminar2.Aquarium;

public class Amia extends Unusualfish implements Volumeable, Temperatureable, Hardnesswaterable {

    public Amia(String name) {
        super(name);
    }

    @Override
    public int temperatureaqarium() {
        return 20;
    }

    @Override
    public int volumeAqarium() {
        return 1000;
    }

    @Override
    public int hardnesswaterable() {
        return 8;
    }
}
