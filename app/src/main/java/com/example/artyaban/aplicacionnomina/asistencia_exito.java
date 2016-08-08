package com.example.artyaban.aplicacionnomina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class asistencia_exito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asistencia_exito);
    }
    public void nueva(View view)
    {
        Intent cambiar4 = new Intent(getApplicationContext(), inicio2.class);
        startActivityForResult(cambiar4, 0);
    }
    public void finasistencia(View view)
    {
        Intent cambiar4 = new Intent(getApplicationContext(), lista_asistencia.class);
        startActivityForResult(cambiar4, 0);

    }
}
