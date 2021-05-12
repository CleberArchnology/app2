package com.example.appmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityMapa extends AppCompatActivity {
    TextView voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        voltar = findViewById(R.id.textViewBackToMenuConsulta);
        voltarTelaMenu();
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