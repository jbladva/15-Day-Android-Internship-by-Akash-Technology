package com.example.radiocalculater;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1 , num2 ;
    TextView result ;
    Button calculate ;
    RadioButton sum , minus , multi , divide  ;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
        calculate = findViewById(R.id.calculate);
        sum = findViewById(R.id.pls);
        minus = findViewById(R.id.minus);
        multi = findViewById(R.id.multi);
        divide = findViewById(R.id.divide);



        calculate.setOnClickListener(v -> {

            if (!num1.getText().toString().isEmpty() && !num2.getText().toString().isEmpty()) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());


                if (sum.isChecked()) {
                    Double total = n1 + n2;
                    @SuppressLint("DefaultLocale") String r = String.format("%.2f", total);

                    result.setText("Summation is :" + r);
                    Log.i(String.valueOf(MainActivity.this), "onClick: " + total);
                    Toast.makeText(MainActivity.this , "Result is :"+ r ,Toast.LENGTH_SHORT).show();
                } else if (minus.isChecked()) {
                    double total = n1 - n2;
                    @SuppressLint("DefaultLocale") String r = String.format("%.2f", total);
                    result.setText("Subtract is :" + r);
                    Log.i(String.valueOf(MainActivity.this), "onClick: " + total);
                    Toast.makeText(MainActivity.this , "Result is :"+ r ,Toast.LENGTH_SHORT).show();
                } else if (multi.isChecked()) {
                    double total = n1 * n2;
                    @SuppressLint("DefaultLocale") String r = String.format("%.2f", total);
                    result.setText("Multiplication is :" + r);
                    Log.i(String.valueOf(MainActivity.this), "onClick: " + total);
                    Toast.makeText(MainActivity.this , "Result is :"+ r ,Toast.LENGTH_SHORT).show();
                } else if (divide.isChecked()) {
                    double total = n1 / n2;
                    @SuppressLint("DefaultLocale") String r = String.format("%.2f", total);
                    result.setText("Division is :" + r);
                    Log.i(String.valueOf(MainActivity.this), "onClick: " + total);
                    Toast.makeText(MainActivity.this , "Result is :"+ r ,Toast.LENGTH_SHORT).show();
                } 
                else
                    result.setText("Please select any operation");
            }
            else
                result.setText("Please write something");
        });



    }
}