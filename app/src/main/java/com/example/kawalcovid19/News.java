package com.example.kawalcovid19;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kawalcovid19.adapter.NewsAdapter;
import com.example.kawalcovid19.model.NewsModel;
import com.example.kawalcovid19.rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class News extends Fragment {
    NewsModel newsModel;
    List<NewsModel> newsModels = new ArrayList<>();
    ApiInterface apiInterface;
    public News() {
        // Required empty public constructor
    }


    public NewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        return null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.news_content);
        NewsAdapter newsModel = new NewsAdapter(getContext(), newsModels);
        recyclerView.setAdapter(newsModel);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        loadNewsData();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void loadNewsData() {
        Call<NewsGet> getNewsData = apiInterface.getNews();
        getNewsData.enqueue(new Callback<NewsGet>() {
            @Override
            public void onResponse(Call<NewsGet> call, Response<NewsGet> response) {
                if (response.code() == 200) {
                    if (response.body().getSuccess() == true) {
                        loadNews();
                    } else {
                        Toast.makeText(getContext(), "Failed To Get Data From Server", Toast.LENGTH_LONG).show();
                    }

                } else {
                    Toast.makeText(getContext(), "Failed To Get Data From Server", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<NewsGet> call, Throwable t) {
                Toast.makeText(getContext(), "Failed To Get Data From Server", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void loadNews() {
        ImageView newsTumbnail = getActivity().findViewById(R.id.image_news);
        ImageView newsAffairs = getActivity().findViewById(R.id.news_affairs);
        TextView newsTitle = getActivity().findViewById(R.id.title_news);
        TextView newsDate = getActivity().findViewById(R.id.date_news);
        TextView newsDesc = getActivity().findViewById(R.id.news_detail);
        TextView affairsName = getActivity().findViewById(R.id.affairsName);
        newsTumbnail.setImageURI(Uri.parse(newsModel.getThumbnail()));
        newsTitle.setText(newsModel.getTitle());
        newsDesc.setText(newsModel.getDesc());
        affairsName.setText(newsModel.getSource());
        newsDate.setText(newsModel.getPostedAt());
        newsAffairs.setImageURI(Uri.parse(newsModel.getSourceLogo()));
    }
}
