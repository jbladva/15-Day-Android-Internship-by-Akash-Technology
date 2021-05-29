package com.example.loginpage;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button loginbtn;
    EditText n1 , n2 ,n3 , n4 , n5;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbtn =(Button) findViewById(R.id.loginbtn);
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        n3 = (EditText) findViewById(R.id.n3);
        n4 = (EditText) findViewById(R.id.n4);
        n5 = (EditText) findViewById(R.id.n5);
        result  = (TextView) findViewById(R.id.result);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nn1 = Integer.parseInt(n1.getText().toString());
                int nn2 = Integer.parseInt(n2.getText().toString());
                int nn3 = Integer.parseInt(n3.getText().toString());
                int nn4 = Integer.parseInt(n4.getText().toString());
                int nn5 = Integer.parseInt(n5.getText().toString());
                int total = (nn1+nn2+nn3+nn4+nn5)/5 ;

                if (total < 50) {
                    result.setText("You are in grade A5 ");
                    Toast.makeText(MainActivity.this, "You are in Grade A5", Toast.LENGTH_SHORT).show();

                }
                else if (total < 60 && total > 50) {
                    result.setText("You are in grade A4 ");
                    Toast.makeText(MainActivity.this, "You are in Grade A4", Toast.LENGTH_SHORT).show();
                }
                else if (total < 70 && total > 60) {
                    result.setText("You are in grade A3 ");
                    Toast.makeText(MainActivity.this, "You are in Grade A3", Toast.LENGTH_SHORT).show();
                }
                else if (total < 80 && total > 70) {
                    result.setText("You are in grade A2 ");
                    Toast.makeText(MainActivity.this, "You are in Grade A2", Toast.LENGTH_SHORT).show();
                }
                else if (total < 100 && total > 80) {
                    result.setText("You are in grade A1 ");
                    Toast.makeText(MainActivity.this, "You are in Grade A1", Toast.LENGTH_SHORT).show();
                }

            }
        });
}
}