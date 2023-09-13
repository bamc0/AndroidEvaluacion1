package com.example.androidevaluacion1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Recycle extends AppCompatActivity {

    private RecyclerView rv1 = (RecyclerView) findViewById(R.id.rv1);
    private ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        itemAdapter = new ItemAdapter(this);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        itemAdapter.setData(getData());
        rv1.setAdapter(itemAdapter);
        rv1.setLayoutManager(linearLayoutManager);
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
        return list;

    }
}