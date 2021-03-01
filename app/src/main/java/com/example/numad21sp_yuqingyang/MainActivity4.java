package com.example.numad21sp_yuqingyang;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;

public class MainActivity4 extends AppCompatActivity {

    private MyAdapter myAdapter;
    private RecyclerView myRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        GetData service = RetrofitClient.getRetrofitInstance().create(GetData.class);
        Call<List<RetroUsers>> call = service.getAllUsers();
    }

}