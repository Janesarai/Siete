package com.example.siete;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private boolean temaClaro = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        if (temaClaro) {
            setTheme(R.style.Base_Theme_Siete);
        } else {
            setTheme(com.google.android.material.R.style.Theme_AppCompat);
        }
        setContentView(R.layout.activity_main);
        Log.d( TAG, "onCreate: inicio de la creacion ");

        initListeners();
    }
    private void initListeners() {
        Button btnCambialTeam = findViewById(R.id.cambioBTN);
        TextView text = findViewById(R.id.textView);
        CalendarView calendar = findViewById(R.id.calendarView);

        btnCambialTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                temaClaro = !temaClaro;
                recreate();

                Snackbar.make(v, "Hello Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Toast.makeText( MainActivity.this,"flu",Toast.LENGTH_SHORT).show();


            }
        });

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);
            }
        });

        Toast.makeText(getBaseContext(), "Bienvenido Toast", Toast.LENGTH_LONG).show();
    }

    }