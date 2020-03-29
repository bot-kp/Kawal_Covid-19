package com.example.kawalcovid19;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kawalcovid19.adapter.ExpandableAdapter;
import com.example.kawalcovid19.model.ExpandableModel;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FaQ extends Fragment {
    private ArrayList<ExpandableModel> faqList = new ArrayList<>();

    public FaQ() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_faq, container, false);
        Button sendWhatsApp = (Button) view.findViewById(R.id.button_whatsapp);
        sendWhatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PackageManager packageManager = getActivity().getPackageManager();
                try {
                    Intent whatsAppIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:081353914515"));
                    PackageInfo info = packageManager.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
                    //Check if package exists or not. If not then code
                    //in catch block will be called
                    whatsAppIntent.setPackage("com.whatsapp");
                    startActivity(Intent.createChooser(whatsAppIntent, ""));

                } catch (PackageManager.NameNotFoundException e) {
                    Toast.makeText(getContext(), "WhatsApp not Installed", Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });

        faqList.addAll(ExpandableData.getExpandableModels());
        RecyclerView recyclerView = view.findViewById(R.id.faq_recyclerview);
        ExpandableAdapter hereosAdapter = new ExpandableAdapter(getContext(), ExpandableData.getExpandableModels());
        recyclerView.setAdapter(hereosAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
