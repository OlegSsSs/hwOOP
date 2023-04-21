package hwSeminar2.Aquarium;

public abstract class Unusualfish extends Fish {
    public Unusualfish(String name) {
        super(name);
    }

    public String feed(){
        return "насекомые";
    }
}
