

public class Validator(){
    public boolean Validate(String s){
        boolean validate=false;
        validate=s.equalsIgnoreCase("password");
        validate=validate&&(s.length>7);
        return validate;
    }
}