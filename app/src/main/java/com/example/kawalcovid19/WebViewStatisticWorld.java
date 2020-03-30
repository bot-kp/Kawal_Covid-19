package com.example.kawalcovid19;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class WebViewStatisticWorld extends AppCompatActivity {
    Fragment selectedFragment = new Home_Fragment();
    private ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indonesia_statistic_detail);
        ImageView btnBack = findViewById(R.id.ic_indo_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragments(selectedFragment);
            }
        });

    }

    private void loadFragments(Fragment selectedFragment) {
        if (selectedFragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fr_content, selectedFragment)
                    .addToBackStack(null)
                    .commit();
        }
    }
}
