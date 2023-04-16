package hwSeminar1.CofeeMachine;

public class Product {
    private String name;
    private Integer volume;
    private Integer temperature;
    private Integer cost;

    public Product(String name, Integer volume, Integer temperature, Integer cost) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("Название: %s Объем: %d Температура: %d Цена: %d",
                name, volume, temperature, cost);
    }
}
