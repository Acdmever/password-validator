package com.example.armando.password_validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator implements Passwords{
    public boolean Validate(String s){
        //Check for numbers
        Pattern p1=Pattern.compile("[0-9]");
        Matcher m1=p1.matcher(s);
        //Check for uppercase
        Pattern p2=Pattern.compile("[A-Z]");
        Matcher m2=p2.matcher(s);
        //Check for lowercase
        Pattern p3=Pattern.compile("[a-z]");
        Matcher m3=p3.matcher(s);
        //Check for special characters
        Pattern p4=Pattern.compile("[^A-Za-z0-9]");
        Matcher m4=p4.matcher(s);
        if (!s.equalsIgnoreCase("password"))
            if (s.length()>7)
                if(m1.find())
                    if(m2.find())
                        if(m3.find())
                            if(m4.find())
                                return true;

        return false;
    }
}