package hwSeminar1.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vm1 = new VendingMachine();
        vm1.addProduct(new Product("Хлеб", 100))
                .addProduct(new Product("Вино", 600))
                .addProduct(new Product("Сыр", 300))
                .addProduct(new Product("Вода", 150))
                .addProduct(new Perfume("Духи", 800, "Красная москва"))
                .addProduct(new Grocery("Тунец", 250, "Рыбные"))
                .addProduct(new Milk("Молоко", 70, 1.5))
                .addProduct(new Milk("Молоко", 80, 3.2))
                .addProduct(new Product("Сок прямого отжима", 300));

        for (int i = 0; i < vm1.getList1().size(); i++) {
            System.out.println(vm1.getList1().get(i));
        }
        System.out.println("-----------------------");
        Product found = vm1.containsProduct("Тунец");
        System.out.println("Поиск продукта Тунец: " + found);
        System.out.println("-----------------------");
        System.out.println("Баланс аппарата до продажи: " + vm1.getAmount());
        Product sold = vm1.sellProduct(found);
        System.out.println("Мы продали из аппарата: " + sold);
        System.out.println("Баланс аппарата: " + vm1.getAmount());
        Product found1 = vm1.containsProduct("Тунец");
        System.out.println("-----------------------");
        System.out.println("Поиск продукта Тунец: " + found1);
        System.out.println("-----------------------");
        Product sold1 = vm1.sellProduct(vm1.containsProduct("Сок прямого отжима"));
        System.out.println("Мы продали из аппарата: " + sold1);
        System.out.println("Баланс нашего аппарата: " + vm1.getAmount());
        System.out.println("-----------------------");
        for (int i = 0; i < vm1.getList1().size(); i++) {
            System.out.println(vm1.getList1().get(i));
        }
        try {                                                                          //обработка NullPointerException
            Product found2 = vm1.sellProduct(vm1.containsProduct("Сок прямого отжима"));
            System.out.println(found2);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
