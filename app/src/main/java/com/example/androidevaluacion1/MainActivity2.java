package com.example.androidevaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

    }


    public void ir1(View v){
        Intent ir = new Intent(this, WidgetsBotones.class);
        startActivity(ir);
    }
    public void ir2(View v){
        Intent ir = new Intent(this, Recycle.class);
        startActivity(ir);
    }
    public void volver(View v){
        Intent ir = new Intent(this, MainActivity.class);
        startActivity(ir);
    }



}