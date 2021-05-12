package com.example.appmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appmobile.ui.SocioDTO;

public class ActivityCadastroSocio extends AppCompatActivity {
    TextView voltar;
    EditText nomeSocio;
    EditText telefoneSocio;
    EditText emailSocio;
    EditText cargoSocio;
    EditText loginSocio;
    EditText senhaSocio;

    Button btnCadSocio;
    Button btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_socio);
        btnCadSocio = findViewById(R.id.btnCadSocio);
        btnCancelar = findViewById(R.id.btnCancelCadSocio);

        loginSocio = findViewById(R.id.editTextCadLoginSocio);
        nomeSocio = findViewById(R.id.editTextCadNameSocio);
        cargoSocio = findViewById(R.id.editTextCadCargoSocio);
        emailSocio = findViewById(R.id.editTextCadEmailSocio);
        telefoneSocio = findViewById(R.id.editTextCadTelSocio);
        senhaSocio = findViewById(R.id.editTextCadSenhaSocio);
        voltar = findViewById(R.id.textViewBackToMenuConsulta);
        voltarTelaMenu();
        limpar();

        btnCadSocio.setOnClickListener((view -> {
            SocioDTO socioDTO = new SocioDTO(
                    loginSocio.getText().toString(),
                    nomeSocio.getText().toString(),
                    cargoSocio.getText().toString(),
                    emailSocio.getText().toString(),
                    telefoneSocio.getText().toString(),
                    senhaSocio.getText().toString()
            );

            AppDAO appDAO = new AppDAO(getApplicationContext());

            if(appDAO.inserirSocio(socioDTO) > 0){
                Toast.makeText(getApplicationContext(), "Inserido com sucesso!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "Erro ao Inserido: ", Toast.LENGTH_SHORT).show();
            }
        }));

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
    private void limpar(){
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginSocio.setText("");
                nomeSocio.setText("");
                cargoSocio.setText("");
                emailSocio.setText("");
                telefoneSocio.setText("");
                senhaSocio.setText("");
            }
        });
    }
}