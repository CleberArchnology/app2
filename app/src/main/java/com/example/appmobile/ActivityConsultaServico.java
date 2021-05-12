package com.example.appmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityConsultaServico extends AppCompatActivity {
    TextView voltar;
    Button btnNovoServico;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_servico);
        voltar = findViewById(R.id.textViewBackToMenuConsulta);
        btnNovoServico = findViewById(R.id.btnNovoServico);
        voltarTelaMenu();
        voltarTelaCadContrato();
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

    private void voltarTelaCadContrato() {
        btnNovoServico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cadServico = new Intent(getApplicationContext(), ActivityCadastroServico.class);
                startActivity(cadServico);
            }
        });
    }
}