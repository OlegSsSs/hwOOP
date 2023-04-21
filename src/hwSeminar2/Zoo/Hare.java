package hwSeminar2.Zoo;

public class Hare extends Herbivores implements Walkable {

    public Hare(String name) {
        super(name);
    }

    public String say() {
        return "Говорит на заячьем языке";
    }

    @Override
    public String toString() {
        return String.format("Hare %s", super.toString());
    }

    @Override
    public int speedForWalk() {
        return 72;
    }
}
