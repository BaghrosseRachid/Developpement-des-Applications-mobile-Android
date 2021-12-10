package com.example.td3_lanc_de;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonForExo1;
    Button buttonForExo2;
    Button buttonForExo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonForExo1 = findViewById(R.id.btn_exo1);
        buttonForExo2 = findViewById(R.id.btn_exo2);
        buttonForExo3 = findViewById(R.id.btn_exo3);

        buttonForExo1.setOnClickListener(v -> {
            Intent intent = new Intent(this, first_exercice.class);
            startActivity(intent);
        });

        buttonForExo2.setOnClickListener(v -> {
            Intent intent = new Intent(this, second_exercice.class);
            startActivity(intent);
        });

        buttonForExo3.setOnClickListener(v -> {
            Intent intent = new Intent(this, third_exercice.class);
            startActivity(intent);
        });

    }
}