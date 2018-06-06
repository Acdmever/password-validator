package com.example.armando.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void equalsPassword() {
        Passwords pw1=new com.example.armando.password_validator.Validator();
        boolean valid1=pw1.Validate("Password");
        assertFalse(valid1);
    }
    @Test
    public void smallPassword() {
        Passwords pw2=new com.example.armando.password_validator.Validator();
        boolean valid2=pw2.Validate("Hi12!");
        assertFalse(valid2);
    }
    @Test
    public void noNumbers() {
        Passwords pw3=new com.example.armando.password_validator.Validator();
        boolean valid3=pw3.Validate("HelloThere!");
        assertFalse(valid3);
    }
    @Test
    public void noUpper() {
        Passwords pw4=new com.example.armando.password_validator.Validator();
        boolean valid4=pw4.Validate("hello1234!");
        assertFalse(valid4);
    }
    @Test
    public void noLower() {
        Passwords pw5=new com.example.armando.password_validator.Validator();
        boolean valid5=pw5.Validate("HELLO1234!");
        assertFalse(valid5);
    }
    @Test
    public void noSpecialKeys() {
        Passwords pw6=new com.example.armando.password_validator.Validator();
        boolean valid6=pw6.Validate("Hello1234");
        assertFalse(valid6);
    }
    @Test
    public void goodPassword() {
        Passwords pw7=new com.example.armando.password_validator.Validator();
        boolean valid7=pw7.Validate("Hello1234!");
        assertTrue(valid7);
    }

}