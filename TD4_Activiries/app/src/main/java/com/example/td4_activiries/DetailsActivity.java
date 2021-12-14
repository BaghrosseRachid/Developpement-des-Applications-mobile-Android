package com.example.td4_activiries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private Button btn_ok;
    private TextView pseudo_user;
    private StoreApplication app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        setTitle(getLocalClassName());

        // Avoir le contexte de l'application
        app = (StoreApplication) getApplicationContext();

        btn_ok = findViewById(R.id.details_to_news);
        pseudo_user = findViewById(R.id.details_pseudo);

        btn_ok.setOnClickListener(v -> {
            Intent intent = new Intent(DetailsActivity.this, NewsActivity.class);
            startActivity(intent);
            finish();
        });
//récupérer le pseudo entré par l'utilisateur
        pseudo_user.setText(app.getPseudo());

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}