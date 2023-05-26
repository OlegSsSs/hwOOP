package hwSeminar6.exercise1;

public class Main{
    public static void main(String[] args){

        Report report = new Report();
        report.output(new DisplayOut());

        Saver saver = new Saver();
        saver.save(new DisplayOut());

    }
}
