package com.example.kawalcovid19;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
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
                selectedFragment = new QnA();
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

    public void onButtonTap(View view) {

        Log.i("Send email", "");
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto: caturrahmat.ctrmt@gmail.com?subject=Kritik dan Saran untuk pengembangan aplikasi Pusat Informasi COVID-19 di Kulon Progo&cc=dhiki@indryanto.dev&body=Terima Kasih atas Saran dan Kritiknya"));

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.i("Finished sending email", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this,
                    "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }

    public void onWhatsAppButtonTap(View view) {


        PackageManager packageManager = getPackageManager();
        try {

            Intent whatsAppIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:081133399000"));
            PackageInfo info = packageManager.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
            //Check if package exists or not. If not then code
            //in catch block will be called
            whatsAppIntent.setPackage("com.whatsapp");
            startActivity(Intent.createChooser(whatsAppIntent, ""));

        } catch (PackageManager.NameNotFoundException e) {
            Toast.makeText(this, "WhatsApp not Installed", Toast.LENGTH_SHORT)
                    .show();
        }
    }

}
