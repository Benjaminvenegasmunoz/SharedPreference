package com.example.sharedpreference;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void Shared(View view){
        Intent shared = new Intent(MainActivity.this, MainShared.class);
        startActivity(shared);
    }

    public void Agenda(View view){
        Intent shared = new Intent(MainActivity.this, MainAgenda.class);
        startActivity(shared);
    }

    public void Block(View view){
        Intent shared = new Intent(MainActivity.this, MainBlock.class);
        startActivity(shared);
    }

    public void Registro(View view){
        Intent shared = new Intent(MainActivity.this, MainNombre1.class);
        startActivity(shared);
    }
}