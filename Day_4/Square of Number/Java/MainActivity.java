package com.example.sqrtprint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button sqrtbtn ;
    EditText n1 ;
    TextView result ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sqrtbtn = findViewById(R.id.sqrtbtn);
        n1 = findViewById(R.id.n1);
        result = findViewById(R.id.result);

        sqrtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(n1.getText().toString());
                if (val <= 10 && val >= 1){
                    val = val*val ;
                    result.setText("Square is :"+ val);
                    Toast.makeText(MainActivity.this , "Square is :"+val ,Toast.LENGTH_SHORT).show();
                    n1.setText("");
                }
                else
                    result.setText("Enter value between 1 to 10");
                Toast.makeText(MainActivity.this , "Enter value between 1 to 10" ,Toast.LENGTH_SHORT).show();
                n1.setText("");
            }
        });
    }
}