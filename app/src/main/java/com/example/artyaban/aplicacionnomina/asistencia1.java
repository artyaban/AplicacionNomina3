package com.example.artyaban.aplicacionnomina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class asistencia1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asistencia1);
        String numEmpleado = getIntent().getExtras().getString("numEmpleado");
        TextView usuario = (TextView) findViewById(R.id.numE);
        usuario.setText(numEmpleado);
    }
    public void verayuda(View view)
    {
        Intent cambiar4 = new Intent(getApplicationContext(), asistencia_ayuda.class);
        startActivityForResult(cambiar4, 0);
    }
    public void registrar(View view)
    {
        Intent cambiar4 = new Intent(getApplicationContext(), asistencia_exito.class);
        startActivityForResult(cambiar4, 0);

      //  int time = (int) (System.currentTimeMillis());
       // Timestamp tsTemp = new Timestamp(time);
       // String entrada =  tsTemp.toString();
       // TimePicker objetosalida = (TimePicker) findViewById(R.id.timePicker);
    //    String hora_salida =objetosalida.getHour();

    }

}
