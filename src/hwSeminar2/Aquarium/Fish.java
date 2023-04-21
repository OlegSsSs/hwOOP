package hwSeminar2.Aquarium;

public abstract class Fish {
    private String name;

    public abstract String feed();

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Вид рыбки: %s", name);
    }
}
