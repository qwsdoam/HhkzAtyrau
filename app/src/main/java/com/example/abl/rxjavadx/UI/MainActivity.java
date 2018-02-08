package com.example.abl.rxjavadx.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import com.example.abl.rxjavadx.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView mRecyclerView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView =  findViewById(R.id.list_view_repos);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        getData();

    }


    private void getData()
    {

        ApiService apiService =
                Client.getClient().create(ApiService.class);
        Call<ServiceS> call = apiService.getTopRatedMovies();
        call.enqueue(new Callback<ServiceS>() {
            @Override
            public void onResponse(Call<ServiceS>call, Response<ServiceS> response) {
                List<Item> item = response.body().getItems();
                RecyclerAdapter recyclerAdapter = new RecyclerAdapter(MainActivity.this,item);
                recyclerAdapter.setOnItemClickListener(new ClickListener() {
                    @Override
                    public void onItemClick(Item item) {
                        Toast.makeText(MainActivity.this,item.getEmployer().getName(),Toast.LENGTH_LONG).show();
                    }
                });
                mRecyclerView.setAdapter(recyclerAdapter);
            }


            @Override
            public void onFailure(Call<ServiceS>call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });
    }







}
