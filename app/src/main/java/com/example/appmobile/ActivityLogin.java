package com.example.appmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class ActivityLogin extends AppCompatActivity {


    Button btnEntrar;
    TextView cadastreSe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnEntrar = findViewById(R.id.btnSignIn);
        cadastreSe = findViewById(R.id.textViewCadastreSe);
        entrarMenu();
        abrirTelaCadastro();
    }

    public void entrarMenu() {
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMenu = new Intent(getApplicationContext(),ActivityMenu.class);
                startActivity(telaMenu);
            }
        });
    }

    private void abrirTelaCadastro() {
        cadastreSe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCadastreSe = new Intent(getApplicationContext(), ActivityCadastroSocio.class);
                startActivity(telaCadastreSe);
            }
        });
    }
}