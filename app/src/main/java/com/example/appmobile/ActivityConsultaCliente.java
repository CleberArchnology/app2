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

import java.util.ArrayList;

public class ActivityConsultaCliente extends AppCompatActivity {
    Button btnNovoCliente;
    ListView listViewCliente;
    TextView voltar;
    ArrayList<ClienteDTO> arrayListCliente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_cliente);
        listViewCliente = findViewById(R.id.listViewCliente);
        voltar = findViewById(R.id.textViewBackToMenuConsulta);
        btnNovoCliente = findViewById(R.id.btnNovoCliente);
        voltarTelaMenu();
        voltarTelaCadCliente();
        AppDAO appDAO = new AppDAO(ActivityConsultaCliente.this);

        arrayListCliente = appDAO.consultarCliente();

        ArrayAdapter adapter = new ArrayAdapter(ActivityConsultaCliente.this, android.R.layout.simple_list_item_1, arrayListCliente);

        listViewCliente.setAdapter(adapter);
    }

    private void voltarTelaCadCliente() {
        btnNovoCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cadCliente = new Intent(getApplicationContext(), ActivityCadastroCliente.class);
                startActivity(cadCliente);
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