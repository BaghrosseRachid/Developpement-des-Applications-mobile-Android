package com.example.appels_reseaux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RepositoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repository);

        Intent intent = getIntent();
        String repo="";
        if (intent.hasExtra("repo")) {
            repo = intent.getStringExtra("repo");
        }

        GithubService githubService = new Retrofit.Builder()
                .baseUrl(GithubService.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GithubService.class);

        githubService.searchRepos(repo).enqueue(new Callback<Repositories>() {
            @Override
            public void onResponse(Call<Repositories> call, Response<Repositories> response) {
                List<Repo> items = response.body().getItems();
                RecyclerView rvRepositories = (RecyclerView) findViewById(R.id.rvRepositories);

                RepositoryAdapter adapter = new RepositoryAdapter(items);
                rvRepositories.setAdapter(adapter);
                rvRepositories.setLayoutManager(new LinearLayoutManager(RepositoryActivity.this));
            }
            @Override
            public void onFailure(Call<Repositories> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }
    public void afficherRepos(List<Repo> repos) {
        Toast.makeText(this,"nombre de dépots : "+repos.size(), Toast.LENGTH_SHORT).show();
    }
}