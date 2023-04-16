package hwSeminar1.VendingMachine;

public class Grocery extends Product {
    private final String view;

    public Grocery(String name, Integer cost, String view) {
        super(name, cost);
        this.view = view;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Консервы: " + view;  //полиморфизм
    }
}
