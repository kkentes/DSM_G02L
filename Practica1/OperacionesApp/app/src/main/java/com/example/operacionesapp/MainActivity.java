package com.example.operacionesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Textnum1;
    private EditText Textnum2;
    private TextView Re;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Textnum1=findViewById(R.id.Textnum1);
        Textnum2=findViewById(R.id.Textnum2);
        Re=findViewById(R.id.Re);
    }

    public void suma(View view){

        String valor1=Textnum1.getText().toString();
        String valor2=Textnum2.getText().toString();

        int num1=Integer.parseInt(valor1);
        int num2=Integer.parseInt(valor2);

        int sum = num1+num2;

        String res=String.valueOf(sum);
        Re.setText(res);
    }

    public void rest(View view){

        String valor1=Textnum1.getText().toString();
        String valor2=Textnum2.getText().toString();

        int num1=Integer.parseInt(valor1);
        int num2=Integer.parseInt(valor2);

        int rest = num1-num2;

        String res=String.valueOf(rest);
        Re.setText(res);
    }

    public void multi(View view){

        String valor1=Textnum1.getText().toString();
        String valor2=Textnum2.getText().toString();

        int num1=Integer.parseInt(valor1);
        int num2=Integer.parseInt(valor2);

        int mult = num1*num2;

        String res=String.valueOf(mult);
        Re.setText(res);
    }

    public void divi(View view){

        String valor1=Textnum1.getText().toString();
        String valor2=Textnum2.getText().toString();

        float num1=Integer.parseInt(valor1);
        float num2=Integer.parseInt(valor2);

        float div = num1/num2;


        String res=String.valueOf(div);

        Re.setText(res);
    }




}