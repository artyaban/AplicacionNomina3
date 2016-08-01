package com.example.artyaban.aplicacionnomina;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

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


       final String usuarioo = usuario.getText().toString() ;
        final String passwordd = password.getText().toString();
        final String[] resultado = new String[1];


            Thread hilo = new Thread(){

                @Override
                public void run ()
                {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            resultado[0] = WSlogin(usuarioo, passwordd);
                        }
                    });


                }
            };




        if (resultado[0] == "true") {


            Intent cambiar = new Intent(getApplicationContext(), inicio2.class);
            startActivityForResult(cambiar, 0);

        } else {



            if (intentos <= 5) {
                intentos = intentos + 1;
                AlertDialog alertDialog = new AlertDialog.Builder(Inicio.this).create();
                alertDialog.setTitle("Alert");
                alertDialog.setMessage("REVISA TU USUARIO Y CONTRASEÑA  \n\n\nINTENTO NÚMERO :" + intentos + resultado[0]);
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


    public String WSlogin(String usuario, String password)
    {
        URL url = null;
        String linea="";
        int respuesta = 0;
        StringBuilder result = null;

        try{

            url= new URL("187.188.159.205:8090/php/apiMexq/public/");
            HttpURLConnection conection = (HttpURLConnection) url.openConnection();
            respuesta = conection.getResponseCode();

            result =  new StringBuilder();

            if (respuesta== HttpURLConnection.HTTP_OK)
            {InputStream in = new BufferedInputStream(conection.getInputStream());
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                while((linea=reader.readLine()) != null)
                {
                    result.append(linea);
                }

            }

        }catch(Exception e){}

        return result.toString();
    }
}