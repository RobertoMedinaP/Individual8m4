package com.example.individual8m4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.example.individual8m4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    // Se crea el binding
    private ActivityMainBinding vbinding1;

    // String para log
    private String TAG= MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Se infla
        vbinding1 = ActivityMainBinding.inflate(getLayoutInflater());
        View view = vbinding1.getRoot();
        setContentView(view);
        Log.i(TAG, "Vista inflada");




        //Llamo al boton 1, escucho el click
        vbinding1.bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //el intent une las dos actividades
                Intent intento = new Intent(MainActivity.this, Activity2.class);
                //al hacer click comienza la otra actividad
                startActivity(intento);

            }
        });


        vbinding1.bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // al hacer click sale de la app
                finish();
                onDestroy();
            }
        });


    }

    // Log para ciclo de vida

    @Override
    protected void onStart() {
        super.onStart();
        // Log d para depuracion
        Log.d(TAG, "OnStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "OnPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "OnDestroy");
    }
}

