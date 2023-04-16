package hwSeminar1.CofeeMachine;

public class BaseProduct extends Product{

    private final String base;

    public BaseProduct(String name, Integer volume, Integer temperature,
                       Integer cost, String base) {
        super(name, volume, temperature, cost);
        this.base = base;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Основа: " + base;
    }
}
