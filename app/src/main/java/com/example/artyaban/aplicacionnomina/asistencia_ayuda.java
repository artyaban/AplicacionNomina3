package com.example.artyaban.aplicacionnomina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class asistencia_ayuda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asistencia_ayuda);
    }


    public void regresar(View view)
    {



        Intent intent2 = new Intent(asistencia_ayuda.this,inicio2.class);

        startActivity(intent2);


    }
}
