package com.example.calculatricetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
      EditText t1;
    EditText t2;
    EditText t3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(EditText) findViewById(R.id.t1);
        t2=(EditText) findViewById(R.id.t2);
        t3=(EditText) findViewById(R.id.t3);

    }

    public void calculate_somme(View view) {
        int first = Integer.parseInt(t1.getText().toString());
        int second = Integer.parseInt(t2.getText().toString());
        int somme = first +second;

        t3.setText(Integer.toString(somme));
    }
}