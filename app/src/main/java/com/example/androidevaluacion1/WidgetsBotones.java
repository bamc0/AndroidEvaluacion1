package com.example.androidevaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;

public class WidgetsBotones extends AppCompatActivity {

    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RatingBar estrellas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets_botones);

        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        estrellas = (RatingBar) findViewById(R.id.estrellas);
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

        Toast.makeText(WidgetsBotones.this, "Radio: "+tipo, Toast.LENGTH_LONG).show();
    }

}