package hwSeminar5.views;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateInput {
    String patternName = "^\\S+$";
    String patternPhone = "^[1-9]+[0-9]*$";
    Pattern pattern = Pattern.compile(patternName, Pattern.MULTILINE);
    Pattern pattern1 = Pattern.compile(patternPhone, Pattern.MULTILINE);

    public boolean chekFirstName(String firstName) {
        Matcher matcher = pattern.matcher(firstName);
        return !matcher.find();
    }

    public boolean chekLastName(String lastName) {
        Matcher matcher = pattern.matcher(lastName);
        return !matcher.find();
    }

    public boolean chekPhone(String phone) {
        Matcher matcher = pattern1.matcher(phone);
        return !matcher.find();
    }
}
