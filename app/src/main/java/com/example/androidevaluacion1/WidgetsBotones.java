package com.example.androidevaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class WidgetsBotones extends AppCompatActivity {

    private RadioButton rb1, rb2, rb3;
    private RatingBar estrellas;
    private CheckBox cb1, cb2, cb3;
    private ProgressBar pb;
    private int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets_botones);

        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        estrellas = (RatingBar) findViewById(R.id.estrellas);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        pb = (ProgressBar) findViewById(R.id.pb);
    }

    public void comprobarRB(){
        String tipo = "";
        if (rb1.isChecked()){
            tipo = rb1.getText().toString();
        } else if (rb2.isChecked()) {
            tipo = rb2.getText().toString();

        } else if (rb3.isChecked()) {
            tipo = rb3.getText().toString();
        } else {
            tipo = "Ninguno";
        }

        Toast.makeText(WidgetsBotones.this, "Radio: "+tipo, Toast.LENGTH_SHORT).show();
    }

    public void cuantasEstrellas(){
        Toast.makeText(WidgetsBotones.this, "Rating de: "+estrellas.getRating()+" estrellas", Toast.LENGTH_SHORT).show();
    }

    public void prog(){

        final Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                contador++;
                pb.setProgress(contador);

                if (contador >= 100)
                    t.cancel();
            }
        };
        t.schedule(tt, 0, 100);
    }
    public void comprobarCB(){
        String comprobarCB1 = "";
        String comprobarCB2 = "";
        String comprobarCB3 = "";
        String etiqueta;
        if (cb1.isChecked())
            comprobarCB1 = cb1.getText().toString()+" ";
        if (cb2.isChecked())
            comprobarCB2 = cb2.getText().toString()+" ";
        if (cb3.isChecked())
            comprobarCB3 = cb3.getText().toString();
        if (cb1.isChecked()||cb2.isChecked()||cb3.isChecked()){
            etiqueta = ("Se seleccionaron los siguientes Checkboxes: "+comprobarCB1+comprobarCB2+comprobarCB3);
            Toast.makeText(WidgetsBotones.this, etiqueta, Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(WidgetsBotones.this, "No se seleccionó ningún checkbox", Toast.LENGTH_SHORT).show();
    }
}