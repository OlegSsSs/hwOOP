package hwSeminar2.Aquarium;

public class Andraosnakehead extends Predator implements Volumeable, Temperatureable, Hardnesswaterable {

    public Andraosnakehead(String name){
        super(name);
    }

    @Override
    public int volumeAqarium() {
        return 70;
    }


    @Override
    public int temperatureaqarium() {
        return 20;
    }

    @Override
    public int hardnesswaterable() {
        return 6;
    }
}
