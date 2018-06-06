package com.example.armando.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import  android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    public void update(View v){
        TextView text =(TextView) findViewById(R.id.textView);
        EditText text2 = (EditText) findViewById(R.id.editText);
        Passwords pw=new com.example.armando.password_validator.Validator();
        boolean valid=pw.Validate(text2.getText().toString());
        if (valid){
            text.setText("Password is valid!");
        }
        else{
            text.setText("Password not strong enough");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
