package com.example.checkweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num;
    Button btn ;
    TextView result ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = findViewById(R.id.num);
        btn = findViewById(R.id.btn);
        result = findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float r = Float.parseFloat(num.getText().toString());

                if (r >0){
                    Toast.makeText(MainActivity.this,"This number is positive",Toast.LENGTH_SHORT).show();
                    result.setText("This number is positive");
                }
                else if (r < 0){
                    Toast.makeText(MainActivity.this,"This number is Negative",Toast.LENGTH_SHORT).show();
                    result.setText("This number is Negative");
                }
                else {
                    Toast.makeText(MainActivity.this,"This number is Zero",Toast.LENGTH_SHORT).show();
                    result.setText("This number is zero");
                }
            }
        });
    }
}