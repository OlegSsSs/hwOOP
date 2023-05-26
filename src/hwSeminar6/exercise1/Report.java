package hwSeminar6.exercise1;

public class Report {

    public void output(ReportAble reportAble){
        reportAble.output(new User("Bob"));
        reportAble.output(new User("Bob1"));
    }
}
