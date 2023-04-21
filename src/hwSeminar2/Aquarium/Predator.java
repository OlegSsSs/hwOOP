package hwSeminar2.Aquarium;

public abstract class Predator extends Fish {
    public Predator(String name) {
        super(name);
    }

    public String feed(){
        return "насекомыме";
    }
}
