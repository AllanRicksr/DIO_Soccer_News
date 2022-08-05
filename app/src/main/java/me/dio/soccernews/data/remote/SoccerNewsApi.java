package me.dio.soccernews.data.remote;

import java.util.List;

import me.dio.soccernews.domain.News;
import retrofit2.Call;
import retrofit2.http.GET;


public class SoccerNewsApi {

    @GET("news.json")
    public Call<List<News>> getNews() {
        return null;
    }
}
