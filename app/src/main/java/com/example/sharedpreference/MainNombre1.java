package com.example.sharedpreference;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainNombre1 extends AppCompatActivity {
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_nombre1);

        et1 = findViewById(R.id.et_nombre);
    }

    public void siguiente(View view){
        String nombre = et1.getText().toString();
        if (nombre.length()==0){
            Toast.makeText(this,"Debes ingresar tu nombre", Toast.LENGTH_SHORT).show();
        }
        if (nombre.length()!=0){
            Toast.makeText(this,"Gracias", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this,MainNombre2.class);
            i.putExtra("dato", et1.getText().toString());
            startActivity(i);
        }
    }
}