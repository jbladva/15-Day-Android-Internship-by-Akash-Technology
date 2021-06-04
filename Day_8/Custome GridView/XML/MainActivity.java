package com.example.customelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    GridView grid;

    int[] image = {R.drawable.beer,R.drawable.cat,R.drawable.dog,R.drawable.lion,R.drawable.monkey,R.drawable.peacock,R.drawable.tiger,R.drawable.zebra};
    String[] text = {"This is beer","This is cat","This is dog","This is lion","This is monkey","This is peacock","This is tiger","This is zebra"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = findViewById(R.id.grid);
        myAdapter myadapter = new myAdapter(MainActivity.this ,image,text);
        grid.setAdapter(myadapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this , displayData.class);
                intent.putExtra("image",image[position]);
                intent.putExtra("text",text[position]);
                startActivity(intent);

            }
        });
    }
}