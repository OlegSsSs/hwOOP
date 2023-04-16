package hwSeminar1.VendingMachine;

public class Сhocolate extends Product {

    private final String variety;

    public Сhocolate(String name, Integer cost, String variety) {
        super(name, cost);
        this.variety = variety;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Вид шоколада: " + variety;
    }
}
