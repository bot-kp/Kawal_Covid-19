package com.example.kawalcovid19;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailNews extends AppCompatActivity {


    private ImageView newsTumbnail;
    private TextView titleNews;
    private TextView detailsNews;
    private TextView newsDate;
    private TextView affairsName;
    private ImageView affairsLogo;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_news);
        newsTumbnail = findViewById(R.id.news_tumbnail);
        titleNews = findViewById(R.id.news_title);
        newsDate = findViewById(R.id.date_news);
        affairsName = findViewById(R.id.affairs_name);
        affairsLogo = findViewById(R.id.affairs_logo);
        detailsNews = findViewById(R.id.news_detail);
        getIncomingIntent();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void getIncomingIntent() {
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            int newsTumbnails = bundle.getInt("news_tumbnail");
            int affairsLogos = bundle.getInt("affairs_logo");
            Glide.with(getApplicationContext()).load(newsTumbnails).into(newsTumbnail);
            Glide.with(getApplicationContext()).load(affairsLogos).into(affairsLogo);
            String getDetailsNews = bundle.getString("news_details");
            String getTitleNews = bundle.getString("news_title");
            String getAffairsName = bundle.getString("affairs_name");
            String getDate = bundle.getString("news_date");
            titleNews.setText(getTitleNews);
            detailsNews.setText(getDetailsNews);
            newsDate.setText(getDate);
            affairsName.setText(getAffairsName);
        }
    }
}
