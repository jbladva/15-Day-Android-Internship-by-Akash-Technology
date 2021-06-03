package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView grid;
    String[] lists = {"Apple" , "Xiome" , "Realme" , "Vivo" , "Oppo" , "Honor" , "Poco" , "IQ00" , "Oneplus" , "Samsung" , "Huwaie" , "Nokia" , "LG" , "Motorola" , "Asus" , "Blackberry" , "Microsoft" , "Micromax"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = findViewById(R.id.grid);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, lists);
        grid.setAdapter(arrayAdapter);

        grid.setOnItemClickListener((parent, view, position, id) -> {

            //Create Toast in list View
            Toast.makeText(MainActivity.this , "You select "+lists[position] ,Toast.LENGTH_SHORT).show();

        });

    }
}