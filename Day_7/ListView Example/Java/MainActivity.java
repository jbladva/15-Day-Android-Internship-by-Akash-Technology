package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] lists = {"Apple" , "Xiome" , "Realme" , "Vivo" , "Oppo" , "Honor" , "Poco" , "IQ00" , "Oneplus" , "Samsung" , "Huwaie" , "Nokia" , "LG" , "Motorola" , "Asus" , "Blackberry" , "Microsoft" , "Micromax"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, lists);
        list.setAdapter(arrayAdapter);

    list.setOnItemClickListener((parent, view, position, id) -> {

        //Create Toast in list View
        Toast.makeText(MainActivity.this , "You select "+lists[position] ,Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this , DisplayData.class);
        intent.putExtra("data" , lists[position]);
        startActivity(intent);
    });
    }
}