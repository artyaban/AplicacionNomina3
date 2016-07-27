package com.example.artyaban.aplicacionnomina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class lista_asistencia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_asistencia);
    }


    public void ayudaincidencias(View view)
    {
        Intent cambiar4 = new Intent(getApplicationContext(), incidencias_ayuda.class);
        startActivityForResult(cambiar4, 0);
    }
    public void cerrarlista(View view)
    {
        Intent cambiar4 = new Intent(getApplicationContext(), lista_asistencia_exito.class);
        startActivityForResult(cambiar4, 0);

    }
}
