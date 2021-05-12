package com.example.appmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityInfo extends AppCompatActivity {

    TextView voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        voltar = findViewById(R.id.textViewBackToMenuInfo);
        voltarTelaMenu();
    }

    public void voltarTelaMenu() {
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMenu = new Intent(getApplicationContext(), ActivityMenu.class);
                startActivity(telaMenu);
            }
        });
    }
}