package com.example.siete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    private boolean temaClaro = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (temaClaro) {
            setTheme(R.style.Base_Theme_Siete);
        } else {
            setTheme(R.style.Siete2);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCambialTeam = findViewById(R.id.cambioBTN);
        btnCambialTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaClaro = !temaClaro;
                recreate();
            }
        });

    }
}