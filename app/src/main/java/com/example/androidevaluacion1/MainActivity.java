package com.example.androidevaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password = (TextView) findViewById(R.id.password);
    }

    public void chequearPass(View v){
        String pass = "1234".toString();
        if (password.getText().length()>0){
            Toast.makeText(MainActivity.this, password.getText(), Toast.LENGTH_SHORT).show();

        } else {
            Intent sig = new Intent(this, MainActivity2.class);
            startActivity(sig);
    }}



}