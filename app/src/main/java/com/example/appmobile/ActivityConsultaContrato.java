package com.example.appmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.appmobile.ui.ClienteDTO;
import com.example.appmobile.ui.ContratoDTO;

import java.util.ArrayList;

public class ActivityConsultaContrato extends AppCompatActivity {
    Button btnNovoContrato;
    ListView listViewContrato;
    TextView voltar;
    ArrayList<ContratoDTO> arrayListContrato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_contrato);
        listViewContrato = findViewById(R.id.listViewContrato);
        voltar = findViewById(R.id.textViewBackToMenuConsulta2);
        btnNovoContrato = findViewById(R.id.btnNovoContrato);
        voltarTelaMenu();
        voltarTelaCadContrato();

        AppDAO appDAO = new AppDAO(ActivityConsultaContrato.this);

        arrayListContrato = appDAO.consultarContrato();

        ArrayAdapter adapter = new ArrayAdapter(ActivityConsultaContrato.this, android.R.layout.simple_list_item_1, arrayListContrato);

        listViewContrato.setAdapter(adapter);
    }

    private void voltarTelaMenu() {
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMenu = new Intent(getApplicationContext(), ActivityConsulta.class);
                startActivity(telaMenu);
            }
        });
    }

    private void voltarTelaCadContrato() {
        btnNovoContrato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cadContrato = new Intent(getApplicationContext(), ActivityCadastroContrato.class);
                startActivity(cadContrato);
            }
        });
    }
}