package com.example.appmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appmobile.ui.ClienteDTO;


public class ActivityCadastroCliente extends AppCompatActivity {
    EditText editTextNameCliente;
    EditText editTextTelCliente;
    EditText editTextEmailCliente;
    EditText editTextCpfCliente;
    EditText editTextCepCliente;
    EditText editTextEndCliente;
    EditText editTextBairroCliente;
    EditText editTextCidadeCliente;
    EditText editTextEstadoCliente;
    EditText editTextComplementoCliente;
    Button btnCadCliente;
    Button btnCancelar;
    TextView voltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente);
        btnCadCliente = findViewById(R.id.btnCadCliente);
        btnCancelar = findViewById(R.id.btnCancelCadClient);

        editTextCpfCliente = findViewById(R.id.editTextCpfCliente);
        editTextNameCliente = findViewById(R.id.editTextNameCliente);
        editTextTelCliente = findViewById(R.id.editTextTelCliente);
        editTextEmailCliente = findViewById(R.id.editTextEmailClient);
        editTextEndCliente = findViewById(R.id.editTextAdressCliente);
        editTextComplementoCliente = findViewById(R.id.editTextComplementoCliente);
        editTextBairroCliente = findViewById(R.id.editTextBairroCliente);
        editTextCidadeCliente = findViewById(R.id.editTextCityCliente);
        editTextCepCliente = findViewById(R.id.editTextCepCliente);
        editTextEstadoCliente = findViewById(R.id.editTextEstadoCliente);
        voltar = findViewById(R.id.textViewBackToMenuConsulta);
        voltarTelaMenu();
        limpar();

        btnCadCliente.setOnClickListener((view) -> {
            ClienteDTO clienteDTO = new ClienteDTO(
                    editTextCpfCliente.getText().toString(),
                    editTextNameCliente.getText().toString(),
                    editTextTelCliente.getText().toString(),
                    editTextEmailCliente.getText().toString(),
                    editTextEndCliente.getText().toString(),
                    editTextComplementoCliente.getText().toString(),
                    editTextBairroCliente.getText().toString(),
                    editTextCidadeCliente.getText().toString(),
                    editTextCepCliente.getText().toString(),
                    editTextEstadoCliente.getText().toString()
            );

            AppDAO appDAO = new AppDAO(getApplicationContext());


            if (appDAO.inserirCliente(clienteDTO) > 0) {
                Toast.makeText(getApplicationContext(), "Inserido com sucesso!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Erro ao ser Inserido: ", Toast.LENGTH_SHORT).show();
            }

        });



    }


    private void limpar(){
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextNameCliente.setText("");
                editTextTelCliente.setText("");
                editTextEmailCliente.setText("");
                editTextCpfCliente.setText("");
                editTextCepCliente.setText("");
                editTextEndCliente.setText("");
                editTextBairroCliente.setText("");
                editTextCidadeCliente.setText("");
                editTextEstadoCliente.setText("");
                editTextComplementoCliente.setText("");
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