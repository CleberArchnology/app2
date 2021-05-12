package com.example.appmobile;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class ActivityMenu extends AppCompatActivity {

    ImageView display, display2, display3, display4, display5, display6, display7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        display = findViewById(R.id.imageViewBInfo);
        display2 = findViewById(R.id.imageViewBCadastro);
        display3 = findViewById(R.id.imageViewBConsulta);
        display4 = findViewById(R.id.imageViewBAtividade);
        display5 = findViewById(R.id.imageViewBMapa);
        display6 = findViewById(R.id.imageViewBPerfil);
        display7 = findViewById(R.id.imageViewBContato);
        abrirTelaInfo();
        abrirTelaCadastro();
        abrirTelaConsulta();
        abrirTelaAtividade();
        abrirTelaMapa();
        abrirTelaPerfil();
        abrirTelaContato();

    }

    private void abrirTelaContato() {
        display7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaContato = new Intent(getApplicationContext(), ActivityTelaContato.class);
                startActivity(telaContato);
            }
        });
    }

    private void abrirTelaPerfil() {
        display6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPerfil = new Intent(getApplicationContext(), ActivityPerfil.class);
                startActivity(telaPerfil);
            }
        });
    }

    private void abrirTelaMapa() {
        display5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMapa = new Intent(getApplicationContext(), ActivityMapa.class);
                startActivity(telaMapa);
            }
        });
    }

    private void abrirTelaAtividade() {
        display4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaAtividade = new Intent(getApplicationContext(), ActivityAtividade.class);
                startActivity(telaAtividade);
            }
        });
    }


    private void abrirTelaConsulta() {
        display3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaConsulta = new Intent(getApplicationContext(), ActivityConsulta.class);
                startActivity(telaConsulta);
            }
        });
    }

     private void abrirTelaCadastro() {
        display2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCadastro = new Intent(getApplicationContext(), ActivityCadastro.class);
                startActivity(telaCadastro);
            }
        });
    }

    private void abrirTelaInfo() {
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaInfo = new Intent(getApplicationContext(), ActivityInfo.class);
                startActivity(telaInfo);
            }
        });
    }

}