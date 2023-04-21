package hwSeminar2.Zoo;

public class Beaver extends Herbivores implements Swimable, Walkable{

    public Beaver(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Говорит на бобрином";
    }

    @Override
    public int speedForSwim() {
        return 8;
    }

    @Override
    public int speedForWalk() {
        return 5;
    }
}
