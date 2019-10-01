package Practise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passwordvalidator {
    private Pattern pattern;
    private Matcher matcher;
    private static final String PASSWORD_PATTERN = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";

    public  Passwordvalidator(){
        pattern = Pattern.compile(PASSWORD_PATTERN);
    }

    public boolean validate(String password){
        matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
