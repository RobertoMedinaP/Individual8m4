package com.example.individual8m4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.individual8m4.databinding.Activity2Binding;

public class Activity2 extends AppCompatActivity {


    private String TAG= Activity2.class.getSimpleName();

    private Activity2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = Activity2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ir a web con intent
                //Se crea string web que contiene la web donde irá el usuario
                String web = "https://kotlindoc.blogspot.com/2019/10/android-log-con-timber.html";
                // Se hace el intent
                Intent pagina = new Intent(Intent.ACTION_VIEW);
                //Se hace el parseo de la string web
                pagina.setData(Uri.parse(web));
                startActivity(pagina);
            }

        });

        binding.bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }


    //Logs para ciclo de vida

    @Override
    protected void onStart() {
        super.onStart();
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

