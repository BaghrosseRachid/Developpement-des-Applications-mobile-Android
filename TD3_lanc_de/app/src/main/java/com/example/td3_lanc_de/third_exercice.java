package com.example.td3_lanc_de;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class third_exercice extends AppCompatActivity {

    TextView resultoftext1;
    TextView resultoftext2;
    EditText facenumber;
    Button run_De;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_exercice);


        resultoftext1 = findViewById(R.id.TV1exo3);
        resultoftext2 = findViewById(R.id.TV2exo3);

        facenumber = findViewById(R.id.editText3);

        run_De = findViewById(R.id.BTNofExo3);

        run_De.setOnClickListener(v -> {
            Toast.makeText(third_exercice.this, "Deux dés lancés ...", Toast.LENGTH_SHORT).show();
            String nb_utilisateur = facenumber.getText().toString();
            int nb_faces =  (nb_utilisateur.equals("")) ? 1 : Integer.parseInt(nb_utilisateur);
            int result1 = (int) (Math.random() * nb_faces) + 1;
            int result2 = (int) (Math.random() * nb_faces) + 1;
            this.resultoftext1.setText(String.valueOf(result1));
            this.resultoftext2.setText(String.valueOf(result2));
        });

    }
}