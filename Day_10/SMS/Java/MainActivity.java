package com.example.callinandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText msg,number;
    Button btnsms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg = findViewById(R.id.msg);
        number = findViewById(R.id.number);
        btnsms = findViewById(R.id.btnsms);

        btnsms.setOnClickListener(this::onClick);
    }

    private void onClick(View v) {


        String me = msg.getText().toString();
        String num = number.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(num,null,me,null,null);
        Toast.makeText(MainActivity.this,"Message sent",Toast.LENGTH_SHORT).show();


    }
}