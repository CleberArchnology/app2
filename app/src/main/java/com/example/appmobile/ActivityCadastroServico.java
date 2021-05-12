package com.example.appmobile;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appmobile.ActivityMenu;
import com.example.appmobile.AppDAO;
import com.example.appmobile.R;
import com.example.appmobile.ui.ServicoDTO;

public class ActivityCadastroServico extends AppCompatActivity {
    TextView voltar;
    EditText nomeServ;
    EditText descricaoServ;
    Button btnCadServico;
    Button btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_servico);
        voltar = findViewById(R.id.textViewBackToMenuConsulta);
        nomeServ = findViewById(R.id.editTextCadNomeServico);
        descricaoServ = findViewById(R.id.editTextCadServicoDesc);
        btnCancelar = findViewById(R.id.btnCancelCadServico);
        voltarTelaMenu();
        limpar();

        btnCadServico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ServicoDTO servicoDTO = new ServicoDTO(
                        nomeServ.getText().toString(),
                        descricaoServ.getText().toString()
                );


                AppDAO clienteDAO = new AppDAO(getApplicationContext());

                try {
                    if(clienteDAO.inserirServico(servicoDTO)>0){
                        Toast.makeText(getApplicationContext(), "Inserido com sucesso!", Toast.LENGTH_SHORT).show();
                    }
                }catch (Exception ex){
                    Log.d("Erro-ao-inserir:", ex.toString());
                    Toast.makeText(getApplicationContext(), "Erro ao Inserido: ", Toast.LENGTH_SHORT).show();
                }
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
    private void limpar(){
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomeServ.setText("");
                descricaoServ.setText("");
            }
        });
    }
}

