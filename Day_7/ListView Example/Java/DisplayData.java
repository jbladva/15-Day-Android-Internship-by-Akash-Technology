package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayData extends AppCompatActivity {
    TextView data;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);

        data = findViewById(R.id.data);
        Intent intent = getIntent();

        String dd = intent.getStringExtra("data");

        data.setText("This mobile is "+dd);

    }
}