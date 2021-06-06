package com.example.sharedprafrencedemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText name,number,email,password;
    Button btnsignup;

    public static final String main_key = "myPref";

    public static final String name_key = "nameKey";
    public static final String email_key = "emailKey";
    public static final String number_key = "numberKey";
    public static final String password_key = "passwordKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        number = findViewById(R.id.number);
        btnsignup = findViewById(R.id.btnsignup);

        btnsignup.setOnClickListener(v -> {

            SharedPreferences preferences = getSharedPreferences(main_key,MODE_PRIVATE);
             String n,e,p,num;
             n = name.getText().toString();
             e = email.getText().toString();
             num = number.getText().toString();
             p = password.getText().toString();

             SharedPreferences.Editor editor = preferences.edit();
             editor.putString(name_key,n);
             editor.putString(email_key,e);
             editor.putString(number_key,num);
             editor.putString(password_key,p);

             editor.apply();

            Intent intent = new Intent(MainActivity.this,loginPage.class);
            startActivity(intent);

        });
    }
}