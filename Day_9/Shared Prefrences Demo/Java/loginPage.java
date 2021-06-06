package com.example.sharedprafrencedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginPage extends AppCompatActivity {

    EditText loginEmail, loginPassword;
    Button btnLogin,btnSignUp;

    public static final String main_key = "myPref";


    public static final String email_key = "emailKey";
    public static final String password_key = "passwordKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        loginEmail = findViewById(R.id.loginEmail);
        loginPassword = findViewById(R.id.loginPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnSignUp = findViewById(R.id.btnSignUp);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userEmail , userPassword;

                userEmail = loginEmail.getText().toString();
                userPassword = loginPassword.getText().toString();

                SharedPreferences preferences = getSharedPreferences(main_key,MODE_PRIVATE);
               String email =  preferences.getString(email_key,"");
                String pass =  preferences.getString(password_key,"");

                if (userEmail.equals(email) && userPassword.equals(pass)){
                    Intent intent = new Intent(loginPage.this , Home.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(loginPage.this , "Email or Password is incorrect",Toast.LENGTH_SHORT).show();

                }

            }
        });


        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginPage.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}