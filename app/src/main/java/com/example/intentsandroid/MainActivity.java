package com.example.projetointentsandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textContador;
    private Button buttonClique;
    private Button buttonZerar;

    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textContador = findViewById(R.id.textContador);
        buttonClique = findViewById(R.id.buttonClique);
        buttonZerar = findViewById(R.id.buttonZerar);

        buttonClique.setOnClickListener(view -> {
            contador++;
            atualizarContador();
        });

        buttonZerar.setOnClickListener(view -> {
            contador = 0;
            atualizarContador();
        });
    }

    private void atualizarContador() {
        textContador.setText(String.valueOf(contador));
    }
}
