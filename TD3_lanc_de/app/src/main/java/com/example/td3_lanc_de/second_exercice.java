package com.example.td3_lanc_de;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class second_exercice extends AppCompatActivity {

    TextView resultoftext1;
    TextView resultoftext2;
    Button run_De;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_exercice);

        resultoftext1 = findViewById(R.id.Tv1OfExo2);
        resultoftext2 = findViewById(R.id.Tv2OfExo2);

        run_De = findViewById(R.id.btnofExo2);

        run_De.setOnClickListener(v -> {
            Toast.makeText(second_exercice.this, "Deux dés lancés !!!!!!", Toast.LENGTH_SHORT).show();
            int result_un = (int) (Math.random() * 6) + 1;
            int result_deux = (int) (Math.random() * 6) + 1;
            this.resultoftext1.setText(String.valueOf(result_un));
            this.resultoftext2.setText(String.valueOf(result_deux));
        });

    }
}