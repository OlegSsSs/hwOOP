package hwSeminar4;

public class Nullshield extends Shield {

    private static Nullshield instance;

    private Nullshield(){
        super(0, 0);
    }

    public static Nullshield getInstance(){
        if (instance == null){
            synchronized (Nullshield.class){
                if (instance == null){
                    instance = new Nullshield();
                }
            }
        }
        return instance;
    }

}