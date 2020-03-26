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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Handler;
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
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home_Fragment extends Fragment {
    private static final int CALL_PERMISSION_REQUEST_CODE = +62;
    private ViewPager2 viewPager2;
    private Handler sliderHandler = new Handler();
    public Home_Fragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        viewPager2 = view.findViewById(R.id.viewPager);

        final List<SliderModel> sliderModels = new ArrayList<>();
        sliderModels.add(new SliderModel(R.drawable.flipper_content_1));
        sliderModels.add(new SliderModel(R.drawable.flipper_main));
        sliderModels.add(new SliderModel(R.drawable.flipper_content_2));
        sliderModels.add(new SliderModel(R.drawable.flipper_content_3));
        sliderModels.add(new SliderModel(R.drawable.flipper_content_4));
        viewPager2.setAdapter(new SliderAdapter(sliderModels, viewPager2));
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);
        viewPager2.setPageTransformer(new ViewPager2.PageTransformer(){
            @Override
            public void transformPage(@NonNull View page, float position) {

                int pageWidth = viewPager2.getMeasuredWidth() - viewPager2.getPaddingLeft() - viewPager2.getPaddingRight();
                int pageHeight = viewPager2.getHeight();
                int paddingLeft = viewPager2.getPaddingLeft();
                float transformPos = (float) (page.getLeft() - (viewPager2.getScrollX() + paddingLeft)) / pageWidth;
                final float normalizedposition = Math.abs(Math.abs(transformPos) - 1);
                page.setAlpha(normalizedposition + 0.5f);

                int max = -pageHeight / 10;

                if (transformPos < -1) { // [-Infinity,-1)
                    // This page is way off-screen to the left.
                    page.setTranslationY(0);
                } else if (transformPos <= 1) { // [-1,1]
                    page.setTranslationY(max * (1-Math.abs(transformPos)));

                } else { // (1,+Infinity]
                    // This page is way off-screen to the right.
                    page.setTranslationY(0);
                }


            }
        });
//        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
//        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
//        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
//            @Override
//            public void transformPage(@NonNull View page, float position) {
//                float r = 1 - Math.abs(position);
//                page.setScaleY(0.85f + r * 0.15f);
//            }
//        });
//        viewPager2.setPageTransformer(compositePageTransformer);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable, 5000);

            }
        });
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
    private Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem()+1);
        }
    };

    public void onPause(){
        super.onPause();
        sliderHandler.removeCallbacks(sliderRunnable);
    };
    public void onResume(){
        super.onResume();
        sliderHandler.postDelayed(sliderRunnable, 3000);
    };

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
}
