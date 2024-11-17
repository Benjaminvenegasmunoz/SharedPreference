package com.example.sharedpreference;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainNombre2 extends AppCompatActivity {
    private TextView tv1;
    RatingBar ratingBar;
    Button calificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_nombre2);


        tv1 = findViewById(R.id.et_nombre2);
        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Bienvenido" + dato);
        ratingBar = findViewById(R.id.ratingBar);
        calificar = findViewById(R.id.Calificar);


        calificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = String.valueOf(ratingBar.getRating());
                Toast.makeText(getApplicationContext(),s+"Estrellas", Toast.LENGTH_SHORT).show();
            }
        });
    }
}