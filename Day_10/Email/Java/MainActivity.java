package com.example.callinandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText email , subject ,msg;
    Button btnemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        subject = findViewById(R.id.subject);
        msg = findViewById(R.id.msg);
        btnemail = findViewById(R.id.btnmail);

        btnemail.setOnClickListener(this::onClick);
    }

    private void onClick(View v) {


        String em = email.getText().toString();
        String su = subject.getText().toString();
        String me = msg.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,new String[]{em});
        intent.putExtra(Intent.EXTRA_SUBJECT,su);
        intent.putExtra(Intent.EXTRA_TEXT,me);
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent,"send email :"));


    }
}