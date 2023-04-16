package hwSeminar1.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<Product> list1 = new ArrayList<>();

    public int getAmount() {
        return amount;
    }

    private int amount = 0;                    // переменная для создания продажи продукта


    public VendingMachine addProduct(Product product) {
        list1.add(product);
        return this;           //указатель на сам объект, который будет возвращать
    }

    public List<Product> getList1() {
        return list1;
    }

    public Product containsProduct(String string) {         //поиск продукта в листе через перебор листа и метод equals
        for (int i = 0; i < getList1().size(); i++) {
            if (getList1().get(i).getName().equals(string)) {
                return getList1().get(i);
            }
        }
        return null;           //вывод null если такой продукт не найден
    }

    public Product sellProduct(Product product) {
        try {
            Product prodFound = containsProduct(product.getName());
            getList1().remove(prodFound);
            amount += prodFound.getCost();
            return prodFound;
        } catch (Exception e) {                                 //Обработка NullPointerException
            throw new RuntimeException("Товар не найден");
        }
    }


}
