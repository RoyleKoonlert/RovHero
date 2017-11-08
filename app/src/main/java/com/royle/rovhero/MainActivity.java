package com.royle.rovhero;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.gson.Gson;
import com.royle.rovhero.adapter.HeroListAdapter;
import com.royle.rovhero.model.HeroListData;
import com.royle.rovhero.network.ApiManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_hero_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiManager.getHeroService().getHeroList().enqueue(new Callback<HeroListData>() {
            @Override
            public void onResponse(Call<HeroListData> call, Response<HeroListData> response) {
                Log.e("onResponse", new Gson().toJson(response.body()));
                if (response.body() != null && response.body().getHeroList() != null) {
                    recyclerView.setAdapter(new HeroListAdapter(response.body().getHeroList()));
                }

            }

            @Override
            public void onFailure(Call<HeroListData> call, Throwable t) {
                Log.e("onFailure", new Gson().toJson(t.getMessage()));
            }
        });
    }
}
