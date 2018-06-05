import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator(){
    public boolean Validate(String s){
        boolean validate=false;
        validate=s.equalsIgnoreCase("password");
        validate=validate&&(s.length>7);
        //Check for numbers
        p=Pattern.compile("[0-9]");
        m=p.matcher(s);
        validate=validate&&(m.find());
        //Check for uppercase
        p=Pattern.compile("[A-Z]");
        m=p.matcher(s);
        validate=validate&&(m.find());
        //Check for lowercase
        p=Pattern.compile("[a-z]");
        m=p.matcher(s);
        validate=validate&&(m.find());
        //Check for special characters
        Pattern p=Pattern.compile("[^A-Za-z0-9]");
        Matcher m=p.matcher(s);
        validate=validate&&(m.find());
        return validate;
    }
}