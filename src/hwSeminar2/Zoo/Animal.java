package hwSeminar2.Zoo;

public abstract class Animal implements Sayable {
    private String name;

    public abstract String feed();

    public Animal(String name) {
        this.name = name;
    }

//    public abstract String say();   //после создания интерфейса Sayable этот метод не нужен

    @Override
    public String toString() {
        return String.format("Name: %s; say %s; feed %s", name, say(), feed());
    }
}
