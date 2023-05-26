package hwSeminar6.exercise1;

public class Saver {

    public void save(SaveAble saveAble){
        saveAble.save(new User("Bob2"));
        saveAble.save(new User("Bob3"));
    }
}
