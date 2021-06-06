package com.example.sharedprafrencedemo;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    TextView name, email , number;
    Button btnlogout;

    public static final String main_key = "myPref";

    public static final String name_key = "nameKey";
    public static final String email_key = "emailKey";
    public static final String number_key = "numberKey";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        name =findViewById(R.id.dname);
        number =findViewById(R.id.dnumber);
        email =findViewById(R.id.demail);
        btnlogout =findViewById(R.id.btnlogout);

        SharedPreferences preferences = getSharedPreferences(main_key,MODE_PRIVATE);
        String nn = preferences.getString(name_key,"");
        String ee =  preferences.getString(email_key,"");
        String num =  preferences.getString(number_key,"");


        name.setText("Name :" +nn);
        email.setText("Email :"+ee);
        number.setText("Number :"+num);

        btnlogout.setOnClickListener(v -> {


            SharedPreferences.Editor editor = preferences.edit();
            editor.clear();
            editor.apply();
            finish();

        });

    }
}