package hwSeminar1.CofeeMachine;

import java.util.ArrayList;
import java.util.List;

public class CofeeMachine {
    List<Product> list1 = new ArrayList<>();

    public int getAmount() {
        return amount;
    }

    private int amount = 0;

    public CofeeMachine addProduct(Product product) {
        list1.add(product);
        return this;
    }

    public List<Product> getList1() {
        return list1;
    }

    public Product findProduct(String string) {
        for (int i = 0; i < getList1().size(); i++) {
            if (getList1().get(i).getName().equals(string)) {
                return getList1().get(i);
            }
        }
        return null;
    }

    public Product sellProduct(Product product) {
        try {
            Product prodFound = findProduct(product.getName());
            getList1().remove(prodFound);
            amount += prodFound.getCost();
            return prodFound;
        } catch (Exception e) {
            throw new RuntimeException("Кофе закончился");
        }
    }
}
