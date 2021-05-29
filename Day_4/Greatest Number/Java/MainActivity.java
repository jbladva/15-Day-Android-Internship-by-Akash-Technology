package com.example.checkweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1 ,num2;
    Button btn ;
    TextView result ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btn = findViewById(R.id.btn);
        result = findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float r1 = Float.parseFloat(num1.getText().toString());
                Float r2 = Float.parseFloat(num2.getText().toString());

                if (r1 > r2){
                    Toast.makeText(MainActivity.this,r1+" is Greatest",Toast.LENGTH_SHORT).show();
                    result.setText(r1+" is Greatest");
                }
                else if (r2 > r1){
                    Toast.makeText(MainActivity.this,r2+" is Greatest",Toast.LENGTH_SHORT).show();
                    result.setText(r2+" is Greatest");
                }
                else {
                    Toast.makeText(MainActivity.this,"Both numbers are equal",Toast.LENGTH_SHORT).show();
                    result.setText("Both numbers are equal");
                }
            }
        });
    }
}