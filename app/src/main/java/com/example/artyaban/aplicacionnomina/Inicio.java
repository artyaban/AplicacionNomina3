package com.example.artyaban.aplicacionnomina;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public static int intentos = 0;



    public void olvido(View view)
    {
        Intent cambiar = new Intent(getApplicationContext(), inicio4.class);
        startActivityForResult(cambiar, 0);

    }

    public void validar(View view) {
        EditText usuario = (EditText) findViewById(R.id.editText);
        EditText password = (EditText) findViewById(R.id.editText2);

        if (usuario.getText().toString().matches("hola")&& password.getText().toString().matches("hola")) {


            Intent cambiar = new Intent(getApplicationContext(), inicio2.class);
            startActivityForResult(cambiar, 0);

        } else {



            if (intentos <= 5) {
                intentos = intentos + 1;
                AlertDialog alertDialog = new AlertDialog.Builder(Inicio.this).create();
                alertDialog.setTitle("Alert");
                alertDialog.setMessage("REVISA TU USUARIO Y CONTRASEÑA  \n\n\nINTENTO NÚMERO :" + intentos);
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }


            if (intentos > 5) {

                Intent cambiar4 = new Intent(getApplicationContext(), inicio3.class);
                startActivityForResult(cambiar4, 0);

            }


        }
    }
}