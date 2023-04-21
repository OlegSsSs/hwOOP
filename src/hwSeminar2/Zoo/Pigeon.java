package hwSeminar2.Zoo;

public class Pigeon extends Herbivores implements Walkable, Flyable{
    public Pigeon(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Урчит голубь";
    }

    @Override
    public int speedForFly() {
        return 20;
    }

    @Override
    public int speedForWalk() {
        return 3;
    }
}
