package com.example.registrationform;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText name , email , number,password ;
    RadioButton male,female;
    CheckBox read, walk , game , ride ;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.uname);
        email = findViewById(R.id.email);
        number = findViewById(R.id.number);
        password = findViewById(R.id.password);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        read = findViewById(R.id.reading);
        walk = findViewById(R.id.walking);
        game = findViewById(R.id.gaming);
        ride = findViewById(R.id.riding);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(v -> {
            String na = name.getText().toString();
            String em = email.getText().toString();
            String pa = password.getText().toString();
            String gen ;
            String nu =  number.getText().toString();
            if (male.isChecked())
                    gen = "Male";
            else
                gen = "Female";
            List<String> hobby = new ArrayList<>();
            if (read.isChecked())
                hobby.add(read.getText().toString());
            if (walk.isChecked())
                hobby.add(walk.getText().toString());
            if (game.isChecked())
                hobby.add(game.getText().toString());
            if (ride.isChecked())
                hobby.add(ride.getText().toString());

            Intent intent = new Intent(MainActivity.this , DataActivity.class);
            intent.putExtra("NAME",na);
            intent.putExtra("EMAIL",em);
            intent.putExtra("PASSWORD",pa);
            intent.putExtra("NUMBER",nu);
            intent.putExtra("GENDER",gen);
            intent.putExtra("HOBBY", String.valueOf(hobby));

            startActivity(intent);
        });



    }
}