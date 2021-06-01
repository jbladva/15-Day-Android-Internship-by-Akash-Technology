package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    TextView dname , demail , dnumber , dgender , dhobby , dpassword;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        dname = findViewById(R.id.dname);
        demail = findViewById(R.id.demail);
        dnumber = findViewById(R.id.dnumber);
        dpassword = findViewById(R.id.dpassword);
        dgender = findViewById(R.id.dgender);
        dhobby = findViewById(R.id.dhobby);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");
        String number = intent.getStringExtra("NUMBER");
        String password = intent.getStringExtra("PASSWORD");
        String gender = intent.getStringExtra("GENDER");
        String hobby = intent.getStringExtra("HOBBY");

        dname.setText("Username :" + name);
        demail.setText("Email :" + email);
        dnumber.setText("Number :" + number);
        dpassword.setText("Password :"+password);
        dgender.setText("Gender :" + gender);
        dhobby.setText("Hobby :" + hobby);
    }
}