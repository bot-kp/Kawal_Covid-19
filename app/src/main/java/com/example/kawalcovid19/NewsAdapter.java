package com.example.kawalcovid19;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {
    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView newsTumbnail;
        private ImageView newsAffairs;
        private TextView newsTitle;
        private TextView newsDetails;
        private TextView newsDate;
        private TextView affairsName;
        private RelativeLayout newsLayout;
        private ViewHolder(@NonNull View itemView) {
            super(itemView);
            newsTumbnail = itemView.findViewById(R.id.image_news);
            newsAffairs = itemView.findViewById(R.id.news_affairs);
            newsTitle = itemView.findViewById(R.id.title_news);
            newsDate = itemView.findViewById(R.id.date_news);
            affairsName = itemView.findViewById(R.id.affairsName);
            newsLayout = itemView.findViewById(R.id.news_layout);
        }
    }
    private Context context;
    private ArrayList<NewsModel> newsModels;


    public NewsAdapter(Context context, ArrayList<NewsModel> list){
        this.context = context;
        this.newsModels = list;
    }

    public ArrayList<NewsModel> getNewsModels(){
        return newsModels;
    }

    public void setNewsModels(ArrayList<NewsModel> newsModels){
        this.newsModels = newsModels;
    }
    @NonNull
    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.news_recyclerview, viewGroup, false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.ViewHolder viewHolder, final int position) {
        Glide.with(context).load(getNewsModels().get(position).getNewsTumbnail()).into(viewHolder.newsTumbnail);
        Glide.with(context).load(getNewsModels().get(position).getAffairsLogo()).into(viewHolder.newsAffairs);
        viewHolder.newsTitle.setText(getNewsModels().get(position).getTitleNews());
        viewHolder.newsDate.setText(getNewsModels().get(position).getNewsDate());
        viewHolder.affairsName.setText(getNewsModels().get(position).getAffairsName());

        viewHolder.newsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailNews.class);
                intent.putExtra("news_tumbnail",getNewsModels().get(position).getNewsTumbnail());
                intent.putExtra("affairs_logo",getNewsModels().get(position).getAffairsLogo());
                intent.putExtra("news_title",getNewsModels().get(position).getTitleNews());
                intent.putExtra("news_details",getNewsModels().get(position).getDetailNews());
                intent.putExtra("news_date",getNewsModels().get(position).getNewsDate());
                intent.putExtra("affairs_name",getNewsModels().get(position).getAffairsName());
                context.startActivity(intent);
            }

        });

    }

    @Override
    public int getItemCount() {
        return getNewsModels().size();
    }

}
