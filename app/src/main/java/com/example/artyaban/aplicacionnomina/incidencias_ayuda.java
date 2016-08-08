package com.example.artyaban.aplicacionnomina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class incidencias_ayuda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incidencias_ayuda);
    }

    public void cerrar(View view )
    {
        Intent cambiar4 = new Intent(getApplicationContext(),lista_asistencia.class);
        startActivityForResult(cambiar4, 0);
    }
}
