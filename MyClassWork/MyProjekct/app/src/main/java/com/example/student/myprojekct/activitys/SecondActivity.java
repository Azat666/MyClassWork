package com.example.student.myprojekct.activitys;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;

import com.example.student.myprojekct.R;
import com.example.student.myprojekct.adapters.AdapterCity;
import com.example.student.myprojekct.models.ModelCity;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterCity adapter;
    List<ModelCity> cityList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView = findViewById(R.id.recyclerView);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cityList.add(new ModelCity(R.drawable.vanadzor, "Vanadzor", "amena gexecik qaxaq@ ashxarhum"));
                cityList.add(new ModelCity(R.drawable.erevan, "Erevan", "Hayastani mayraqaxaq "));
                cityList.add(new ModelCity(R.drawable.gyumri, "Gyumri", "Shiraki Mrzi Kentron@ "));
                setRecyclearView();
                swipeToDeleteRight(recyclerView);
            }
        });
    }

    public void setRecyclearView() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        adapter = new AdapterCity(cityList, this);
        recyclerView.setAdapter(adapter);
    }

    private void swipeToDeleteRight(final RecyclerView recyclerView) {
        final ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                final int position = viewHolder.getAdapterPosition();
                cityList.remove(position);
                adapter.notifyDataSetChanged();
            }
        };
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleCallback);
        itemTouchHelper.attachToRecyclerView(recyclerView);
    }
}
