package com.bkacad.nnt.advancedlistviewd01;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvWeather;
    // Khai báo Adapter
    private MyAdapter myAdapter;
    // Khai báo Datasource
    private List<ItemCity> dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bind id
        lvWeather = findViewById(R.id.lvWeather);
        // Fake dữ liệu trước
        dataSource = new ArrayList<>();
        dataSource.add(new ItemCity(29, "Hà Nội", "Mưa nhỏ", "https://cdn-icons-png.flaticon.com/512/116/116251.png", 29));
        dataSource.add(new ItemCity(29, "Hà Nội", "Mưa nhỏ", "https://cdn-icons-png.flaticon.com/512/116/116251.png", 29));
        dataSource.add(new ItemCity(29, "Hà Nội", "Mưa nhỏ", "https://cdn-icons-png.flaticon.com/512/116/116251.png", 29));

        // Tạo adpter
        myAdapter = new MyAdapter(this, dataSource);
        // Set Adapter cho listview
        lvWeather.setAdapter(myAdapter);
    }
}