package com.example.appmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.appmobile.ui.SocioDTO;

import java.util.ArrayList;

public class ActivityConsultaSocio extends AppCompatActivity {
    ListView listViewSocio;
    ArrayList<SocioDTO> arrayListSocio;
    TextView voltar;
    Button btnNovoSocio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_socio);
        listViewSocio = findViewById(R.id.listViewSocio);
        voltar = findViewById(R.id.textViewBackToMenuConsulta);
        btnNovoSocio = findViewById(R.id.btnNovoSocio);
        voltarTelaMenu();

        AppDAO appDAO = new AppDAO(ActivityConsultaSocio.this);

        arrayListSocio = appDAO.consultarSocio();

        ArrayAdapter adapter = new ArrayAdapter(ActivityConsultaSocio.this, android.R.layout.simple_list_item_1, arrayListSocio);

        listViewSocio.setAdapter(adapter);
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

    private void voltarTelaCadSocio() {
        btnNovoSocio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cadSocio = new Intent(getApplicationContext(), ActivityCadastroSocio.class);
                startActivity(cadSocio);
            }
        });
    }
}