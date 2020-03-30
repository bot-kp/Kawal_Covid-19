package com.example.kawalcovid19.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kawalcovid19.R;
import com.example.kawalcovid19.model.NewsModel;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {
    private Context context;
    private List<NewsModel> newsList;
    private RecyclerView.Adapter newsAdapter;

    public NewsAdapter(android.content.Context context, List<NewsModel> newsList) {
        this.context = context;
        this.newsList = newsList;
    }

    public List<NewsModel> getNewsModels() {
        return newsList;
    }

    public void setNewsModels(List<NewsModel> newsList) {
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_recyclerview, parent, false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.ViewHolder holder, int position) {
        holder.newsTitle.setText(newsList.get(position).getTitle());
        holder.newsDetails.setText(newsList.get(position).getDesc());
        holder.newsDate.setText(newsList.get(position).getPostedAt());
        holder.newsTumbnail.setImageURI(Uri.parse(newsList.get(position).getThumbnail()));
        holder.newsAffairs.setImageURI(Uri.parse(newsList.get(position).getSourceLogo()));
        holder.affairsName.setText(newsList.get(position).getSource());

    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView newsTumbnail;
        private ImageView newsAffairs;
        private TextView newsTitle;
        private TextView newsDetails;
        private TextView newsDate;
        private TextView affairsName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            newsTumbnail = itemView.findViewById(R.id.image_news);
            newsAffairs = itemView.findViewById(R.id.news_affairs);
            newsTitle = itemView.findViewById(R.id.title_news);
            newsDate = itemView.findViewById(R.id.date_news);
            affairsName = itemView.findViewById(R.id.affairsName);
        }
    }
}
