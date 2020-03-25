package com.example.kawalcovid19;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class QnA extends Fragment {
    private ArrayList<ExpandableModel> faqList = new ArrayList<>();

    public QnA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_qna, container, false);
        faqList.addAll(ExpandableData.getExpandableModels());
        RecyclerView recyclerView = view.findViewById(R.id.faq_recyclerView);
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
