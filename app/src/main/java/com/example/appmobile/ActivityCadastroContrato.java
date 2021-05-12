package com.example.appmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appmobile.ui.ContratoDTO;

public class ActivityCadastroContrato extends AppCompatActivity {
    EditText codContrato;
    EditText descricao;
    EditText cpfCliente;
    EditText usuarioSocio;
    EditText nomeServico;

    TextView voltar;

    Button btnCadContrato;
    Button btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_contrato);

        codContrato = findViewById(R.id.editTextCadCodContrato);
        usuarioSocio = findViewById(R.id.editTextCadUsuarioContrato);
        cpfCliente = findViewById(R.id.editTextCadCpfClienteContrato);
        nomeServico = findViewById(R.id.editTextCadNomeContrato);
        descricao = findViewById(R.id.editTextDescricaoContrato);
        voltar = findViewById(R.id.TextViewBackToMenuContrato);
        btnCancelar = findViewById(R.id.btnCancelContrato);
        btnCadContrato = findViewById(R.id.btnCadContrato);
        voltarTelaMenu();
        limpar();

        btnCadContrato.setOnClickListener((view) -> {
            ContratoDTO contratoDTO = new ContratoDTO(
                    descricao.getText().toString(),
                    cpfCliente.getText().toString(),
                    usuarioSocio.getText().toString(),
                    nomeServico.getText().toString()
            );

            AppDAO appDAO = new AppDAO(getApplicationContext());

            if (appDAO.inserirContrato(contratoDTO) > 0) {
                Toast.makeText(getApplicationContext(), "Inserido com sucesso!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Erro ao ser Inserido: ", Toast.LENGTH_SHORT).show();
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

    private void limpar() {
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                codContrato.setText("");
                usuarioSocio.setText("");
                cpfCliente.setText("");
                nomeServico.setText("");
                descricao.setText("");
            }
        });
    }
}