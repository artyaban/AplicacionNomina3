package com.example.artyaban.aplicacionnomina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class asistencia_falla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asistencia_falla);
    }

    public void nuevointento(View view)
    {
        Intent cambiar4 = new Intent(getApplicationContext(), inicio2.class);
        startActivityForResult(cambiar4, 0);
    }
}
