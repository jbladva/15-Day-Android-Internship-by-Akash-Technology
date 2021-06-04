package com.example.customelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class displayData extends AppCompatActivity {

    ImageView image ;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);

        image = findViewById(R.id.image);
        text = findViewById(R.id.text);

        Intent intent= getIntent();
        int img = intent.getIntExtra("image",R.drawable.beer);
        image.setImageResource(img);
        String txt = intent.getStringExtra("text");
        text.setText(txt);

    }
}