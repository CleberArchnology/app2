package com.example.appmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityCadastro extends AppCompatActivity {

    ImageView showCadastro, showCadastro2, showCadastro3, showCadastro4;
    TextView voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        showCadastro = findViewById(R.id.imageViewPartner);
        showCadastro2 = findViewById(R.id.imageViewContract);
        showCadastro3 = findViewById(R.id.imageViewClient);
        showCadastro4 = findViewById(R.id.imageViewBContrato3);
        voltar = findViewById(R.id.textViewBackToMenuCadastro);
        abrirTelaCadastroSocio();
        abrirTelaCadastroContrato();
        abrirTelaCadastroServico();
        abrirTelaCadastroCliente();
        voltarTelaMenu();

    }

    private void abrirTelaCadastroCliente() {
        showCadastro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCadCliente = new Intent(getApplicationContext(), ActivityCadastroCliente.class);
                startActivity(telaCadCliente);
            }
        });
    }

    private void abrirTelaCadastroServico() {
        showCadastro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCadServico = new Intent(getApplicationContext(), ActivityCadastroServico.class);
                startActivity(telaCadServico);
            }
        });
    }

    private void abrirTelaCadastroSocio() {
        showCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCadSocio = new Intent(getApplicationContext(), ActivityCadastroSocio.class);
                startActivity(telaCadSocio);
            }
        });
    }

    private void abrirTelaCadastroContrato() {
        showCadastro4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCadContrato = new Intent(getApplicationContext(), ActivityCadastroContrato.class);
                startActivity(telaCadContrato);
            }
        });
    }

    private void voltarTelaMenu() {
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMenu = new Intent(getApplicationContext(), ActivityMenu.class);
                startActivity(telaMenu);
            }
        });
    }
}


