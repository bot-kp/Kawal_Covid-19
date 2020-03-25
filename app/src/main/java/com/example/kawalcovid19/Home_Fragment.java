package com.example.kawalcovid19;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home_Fragment extends Fragment {
    ViewFlipper imageFlip;
    public Home_Fragment() {
        // Required empty public constructor
    }


    private static final int CALL_PERMISSION_REQUEST_CODE = 1234;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int images[] = {R.drawable.flipper_main, R.drawable.flipper_content_1, R.drawable.flipper_content_2,R.drawable.flipper_content_3,R.drawable.flipper_content_4};
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        imageFlip = view.findViewById(R.id.flippImage);
        for (int image : images){
            ImageView imageView = new ImageView(getActivity());
            imageView.setBackgroundResource(image);
            imageFlip.addView(imageView);
            imageFlip.setFlipInterval(8000);
            imageFlip.setInAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.slide));
            imageFlip.startFlipping();
        }
        Button btnRSUDWates = (Button) view.findViewById(R.id.callRSUDWates);
        Button btnRSUDNyiAgengSerang = (Button) view.findViewById(R.id.callRSUDNyiAgengSerang);
        Button btnMapRSUDWates = (Button) view.findViewById(R.id.mapsRSUDWates);
        Button btnMapRSUDNyiAgengSerang = (Button) view.findViewById(R.id.mapsRSUDNyiAgengSerang);
        btnRSUDWates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callRSUDWates();
            }
        });
        btnRSUDNyiAgengSerang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callRSUDNyiAgengSerang();
            }
        });
        btnMapRSUDWates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapsRSUDWates();
            }
        });
        btnMapRSUDNyiAgengSerang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapsRSUDNyiAgengSerang();
            }
        });
        return view;
    }

    private void mapsRSUDWates() {
        Intent mapsRSUDWates = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/n9bWSEThR2tYpLsn9"));
        startActivity(mapsRSUDWates);
    }

    private void mapsRSUDNyiAgengSerang() {
        Intent mapsRSUDWates = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/XPD627cG8LLXiDyQ9"));
        startActivity(mapsRSUDWates);
    }

    void callRSUDWates() {
        if (ContextCompat.checkSelfPermission(getContext(), Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:" + "0274773169"));
            getActivity().startActivity(callIntent);
        } else {
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.CALL_PHONE},
                    CALL_PERMISSION_REQUEST_CODE);
        }
    }
    void callRSUDNyiAgengSerang() {
        if (ContextCompat.checkSelfPermission(getContext(), Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:" + "02747880912"));
            getActivity().startActivity(callIntent);
        } else {
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.CALL_PHONE},
                    CALL_PERMISSION_REQUEST_CODE);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == CALL_PERMISSION_REQUEST_CODE && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(getContext(), "Permission Granted", Toast.LENGTH_SHORT).show();
        }

}

    private void setContentView(int activity_detail_news) {
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
