package com.example.androidevaluacion1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Recycle extends AppCompatActivity {

    private RecyclerView rv1;
    private ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        rv1 = (RecyclerView) findViewById(R.id.rv1);
        itemAdapter = new ItemAdapter(this);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        itemAdapter.setData(getData());
        rv1.setAdapter(itemAdapter);
        rv1.setLayoutManager(linearLayoutManager);
    }

    public void volver(View v){
        Intent ant = new Intent(this, MainActivity2.class);
        startActivity(ant);
    }

    private List<Item> getData() {
        List<Item> list = new ArrayList<>();
        list.add(new Item(R.drawable.facebook, "Facebook"));
        list.add(new Item(R.drawable.instagram, "Instagram"));
        list.add(new Item(R.drawable.messenger, "Messenger"));
        list.add(new Item(R.drawable.reddit, "Reddit"));
        list.add(new Item(R.drawable.tumblr, "Tumblr"));
        list.add(new Item(R.drawable.whatsapp, "WhatsApp"));
        list.add(new Item(R.drawable.x, "X"));
        list.add(new Item(R.drawable.youtube, "Youtube"));
        list.add(new Item(R.drawable.facebook, "dxxc"));
        list.add(new Item(R.drawable.instagram, "exw"));
        list.add(new Item(R.drawable.messenger, " dcd"));
        list.add(new Item(R.drawable.reddit, "Cringe"));
        list.add(new Item(R.drawable.tumblr, "Hellsite"));
        list.add(new Item(R.drawable.whatsapp, "Confiable :)"));
        list.add(new Item(R.drawable.x, "Víctima de Elon"));
        list.add(new Item(R.drawable.youtube, ":/"));
        return list;

    }
}