package me.dio.soccernews.ui.news;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();


        //TODO Remover mock de nooticias
        List<News> news = new ArrayList<>();
        news.add(new News("Derrota do Corintias","agafgewsdfwq"));
        news.add(new News("Flamengo empata em casa","gfwdsfewgefwfq"));
        news.add(new News("FLA FLU no domingo","efewfrhwgwrfqagqgegrh"));

        this.news.setValue(news);
    }

    public MutableLiveData<List<News>> getNews() {
        return news;
    }
}