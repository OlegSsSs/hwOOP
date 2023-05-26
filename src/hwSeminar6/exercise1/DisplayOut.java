package hwSeminar6.exercise1;

public class DisplayOut implements ReportAble, SaveAble {

    @Override
    public void output(User user) {
        System.out.format("Report user: %s\n",user.getName());
    }

    @Override
    public void save(User user) {
        System.out.format("Save user: %s\n", user.getName());
    }
}
