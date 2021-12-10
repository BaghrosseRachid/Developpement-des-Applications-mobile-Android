package com.example.td3_lanc_de;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class first_exercice extends AppCompatActivity {

    TextView scene;
    Button run_de;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_exercice);
        scene = findViewById(R.id.textView1);
        run_de = findViewById(R.id.btn1);
        run_de.setOnClickListener(v -> {
            Toast.makeText(first_exercice.this, "Dé lancé !!!!!!", Toast.LENGTH_SHORT).show();
            int result = (int) (Math.random() * 6) + 1;
            this.scene.setText(String.valueOf(result));
        });
    }
}
