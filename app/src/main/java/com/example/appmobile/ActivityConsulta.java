package com.example.appmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityConsulta extends AppCompatActivity {

    ImageView show, show2, show3, show4;
    TextView voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);
        show = findViewById(R.id.imageViewConSocio);
        show2 = findViewById(R.id.imageViewConServicos);
        show3 = findViewById(R.id.imageViewConCliente);
        show4 = findViewById(R.id.imageViewBContrato);
        voltar = findViewById(R.id.textViewBackToMenuConsulta);
        abrirTelaSocio();
        abrirTelaContrato();
        abrirTelaServico();
        abrirTelaCliente();
        voltarTelaMenu();
    }

    private void abrirTelaCliente() {
        show3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCliente = new Intent(getApplicationContext(), ActivityConsultaCliente.class);
                startActivity(telaCliente);
            }
        });
    }

    private void abrirTelaContrato() {
        show4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaContrato = new Intent(getApplicationContext(), ActivityConsultaContrato.class);
                startActivity(telaContrato);
            }
        });
    }

    private void abrirTelaServico() {
        show2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaServico = new Intent(getApplicationContext(), ActivityConsultaServico.class);
                startActivity(telaServico);
            }
        });
    }

    private void abrirTelaSocio() {
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaSocio = new Intent(getApplicationContext(), ActivityConsultaSocio.class);
                startActivity(telaSocio);
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