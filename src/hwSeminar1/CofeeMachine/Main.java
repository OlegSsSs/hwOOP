package hwSeminar1.CofeeMachine;

public class Main {
    public static void main(String[] args) {
        CofeeMachine cm1 = new CofeeMachine();
        cm1.addProduct(new Product("Эспрессо", 30, 67, 200))
                .addProduct(new Product("Кофе по-турецки", 60, 70, 250))
                .addProduct(new Product("Фильтр кофе", 240, 69, 270))
                .addProduct(new Product("Растворимый", 240, 65, 150))
                .addProduct(new BaseProduct("Флэт Вайт", 240, 64, 350, "Молоко"))
                .addProduct(new BaseProduct("Каппучино", 240, 66, 300, "Молоко"))
                .addProduct(new BaseProduct("Латте", 180, 68, 270, "Молоко"))
                .addProduct(new BaseProduct("Бревэ", 120, 62, 280, "Эспрессо"));
        for (int i = 0; i < cm1.getList1().size(); i++) {
            System.out.println(cm1.getList1().get(i));
        }
        System.out.println("-----------------------");
        Product find1 = cm1.findProduct("Фильтр кофе");
        System.out.println("Поиск Фильтр кофе в аппарате: " + find1);
        System.out.println("-----------------------");
        System.out.println("Баланс аппарата: " + cm1.getAmount());
        Product sold1 = cm1.sellProduct(find1);
        System.out.println("Мы продали из аппарата: " + sold1);
        System.out.println("Баланс аппарата: " + cm1.getAmount());
        Product find2 = cm1.findProduct("Фильтр кофе");
        System.out.println("-----------------------");
        System.out.println("Поиск Фильтр кофе в аппарате: " + find2);
        System.out.println("-----------------------");
        Product sold2 = cm1.sellProduct(cm1.findProduct("Эспрессо"));
        System.out.println("Продан Эспрессо: " + sold2);
        System.out.println("Баланс аппарата: " + cm1.getAmount());
        System.out.println("-----------------------");
        for (int i = 0; i < cm1.getList1().size(); i++) {
            System.out.println(cm1.getList1().get(i));
        }
        try {                                                                          //обработка NullPointerException
            Product find3 = cm1.sellProduct(cm1.findProduct("Эспрессо"));
            System.out.println(find3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
