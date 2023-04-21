package hwSeminar2.Zoo;

public class Duck extends Herbivores implements Walkable, Flyable, Swimable{

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Говорит утка";
    }

    @Override
    public int speedForFly() {
        return 80;
    }

    @Override
    public int speedForWalk() {
        return 5;
    }

    @Override
    public int speedForSwim() {
        return 2;
    }
}
