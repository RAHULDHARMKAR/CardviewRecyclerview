package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Model> list;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        list = new ArrayList<>();
        list.add(new Model(R.mipmap.ic_launcher, "Item 1"));
        list.add(new Model(R.mipmap.ic_launcher,"Item 2"));
        list.add(new Model(R.mipmap.ic_launcher, "Item 3"));
        list.add(new Model(R.mipmap.ic_launcher,"Item 4"));

        adapter = new Adapter(MainActivity.this, list);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapter);
    }
}
