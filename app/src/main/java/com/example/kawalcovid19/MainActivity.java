package com.example.kawalcovid19;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    Fragment selectedFragment = new Home_Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        loadFragments(selectedFragment);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_home:
                selectedFragment = new Home_Fragment();
                loadFragments(selectedFragment);
                break;
            case R.id.nav_news:
                selectedFragment = new News();
                loadFragments(selectedFragment);
                break;
            case R.id.nav_QnA:
                selectedFragment = new FaQ();
                loadFragments(selectedFragment);
                break;
            case R.id.nav_about:
                selectedFragment = new About();
                loadFragments(selectedFragment);
                break;
        }
        return loadFragments(selectedFragment);
    }

    private boolean loadFragments(Fragment selectedFragment) {

        if (selectedFragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fr_content, selectedFragment)
                    .commit();
            return true;
        }
        return false;
    }

}
