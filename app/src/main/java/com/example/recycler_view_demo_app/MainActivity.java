package com.example.recycler_view_demo_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerview;
    RecyclerView.LayoutManager layoutManager;
    private ArrayList<MyDataModel> dataModel;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(layoutManager);

        //data bind(attach) adapter
        dataModel = new ArrayList<>();
        for(int i=0 ; i<Mydata.drawablearray.length ; ++i)
        {
            dataModel.add(new MyDataModel(Mydata.drawablearray[i]));
        }

        adapter = new RecyclerAdapter(dataModel);
        recyclerview.setAdapter(adapter);

    }
}