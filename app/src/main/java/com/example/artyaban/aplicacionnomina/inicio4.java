package com.example.artyaban.aplicacionnomina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class inicio4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio4);
    }


    public void enviarcorreo(View view)
    {
        //WEB SERVICES CORREO  PUT.....

        Intent cambiar = new Intent(getApplicationContext(), Inicio.class);
        startActivityForResult(cambiar, 0);
    }


    public void  regresa(View view)
    {
        Intent cambiar = new Intent(getApplicationContext(), Inicio.class);
        startActivityForResult(cambiar, 0);

    }
}
