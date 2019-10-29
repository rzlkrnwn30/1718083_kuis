package com.example.recyclerview_keluarga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Keluarga_Adapter keluarga_adapter;
    private ArrayList<Keluarga>keluargaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = findViewById(R.id.recycleView);
        keluarga_adapter = new Keluarga_Adapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(keluarga_adapter);
    }
    private void tambahData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Bambang Sutejo", "Ayah", getDrawable(R.drawable.draw1)));
        keluargaArrayList.add(new Keluarga("Susan Risnawati", "Ibu", getDrawable(R.drawable.draw2)));
        keluargaArrayList.add(new Keluarga("Mochamad Rizal Kurniawan", "Anak", getDrawable(R.drawable.draw3)));
    }
}
