package com.sametozalp.calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber;
    EditText editTextNumber2;
    TextView textView2;
    int number1;
    int number2;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        textView2 = findViewById(R.id.textView2);
    }

    public void errorMessage (){
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("ERROR!");
        alert.setMessage("Try Again.");
        alert.show();
    }

    public void takeTheValue(){
        try{
            number1 = Integer.parseInt(editTextNumber.getText().toString());
            number2 = Integer.parseInt(editTextNumber2.getText().toString());
        }catch (Exception e){
            System.out.println(e);
            errorMessage();
        }
    }

    public void addition(View view) {
        takeTheValue();
        int result = number1 + number2;
        textView2.setText(String.valueOf(result));
    }

    public void subtraction(View view){
        takeTheValue();
        int result = number1 - number2;
        textView2.setText(String.valueOf(result));
    }

    public void multiplication (View view){
        takeTheValue();
        int result = number1 * number2;
        textView2.setText(String.valueOf(result));
    }

    public void division(View view){
        takeTheValue();
        int result = number1 / number2;
        textView2.setText(String.valueOf(result));
    }
}