package hwSeminar1.VendingMachine;

public class Milk extends Product{
    private final Double fatcontent;

    public Milk(String name, Integer cost, Double fatcontent) {
        super(name, cost);
        this.fatcontent = fatcontent;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Жирность в %: " + fatcontent;  //полиморфизм
    }
}
