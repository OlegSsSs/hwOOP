package hwSeminar2.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addList(new Wolf("Wolf one"))
                .addList(new Hare("Hare one"))
                .addList(new Duck("Duck one"))
                .addList(new Pigeon("Pigeon one"))
                .addList(new Beaver("Beavor one"));
        zoo.setRadio(new Radio());

        for (var item: zoo.getListAnimal()) {
            System.out.println(item);
        }
        System.out.println("-------------");

        for (var item: zoo.getSayable()){
            System.out.println(item.say());
        }
        System.out.println("-------------");

        for (var item: zoo.walkable()){
            System.out.printf("Бегают: %s Скорость: %d\n", item.toString(), item.speedForWalk());
        }

        for (var item: zoo.flyable()){
            System.out.printf("Летают: %s Скорость: %d\n", item.toString(), item.speedForFly());
        }
        for (var item: zoo.swimable()){
            System.out.printf("Плавают: %s Скорость: %d\n", item.toString(), item.speedForSwim());
        }
        System.out.println("Победитель в беге: " + zoo.winnerWalk());
        System.out.println("Победитель в полете: " + zoo.winnerFly());
        System.out.println("Победитель в плавании: " + zoo.winnerSwim());
    }
}
