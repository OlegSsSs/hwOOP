package hwSeminar2.Aquarium;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.addList(new Andraosnakehead("Змееголов"))
                .addList(new Andraosnakehead("Синий змееголов"))
                .addList(new Meshslope("Cетчатый скат"))
                .addList(new Amia("Боуфин"));
        System.out.println("Список рыбок: ");
        for (var item: aquarium.getListFish()){
            System.out.println(item);
        }
        System.out.println("-------------");
        for (var item: aquarium.volumeables()){
            System.out.printf("%s Объем аквариума: %d \n", item.toString(), item.volumeAqarium());
        }
        System.out.println("-------------");
        for (var item: aquarium.temperatureables()){
            System.out.printf("%s Температура в аквариуме: %d \n", item.toString(), item.temperatureaqarium());
        }
        System.out.println("-------------");
        for (var item: aquarium.hardnesswaterables()){
            System.out.printf("%s Жесткость воды в аквариуме: %d\n", item.toString(), item.hardnesswaterable());
        }
    }
}
