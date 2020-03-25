package com.example.kawalcovid19;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ExpandableAdapter extends RecyclerView.Adapter <ExpandableAdapter.ViewHolder> {
    RecyclerView recyclerView;
    ConstraintLayout expandableLayout;
    private Context context;
    private ArrayList<ExpandableModel> expandableModels;
    public class ViewHolder extends RecyclerView.ViewHolder {
        public ConstraintLayout expandableLayout;
        private TextView tvFaQTitle;
        private TextView tvFaQDetails;
        private ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvFaQTitle = itemView.findViewById(R.id.ex_title);
            tvFaQDetails = itemView.findViewById(R.id.ex_detail);
            expandableLayout = itemView.findViewById(R.id.expandableLayout);
            tvFaQTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    ExpandableModel movie = expandableModels.get(getAdapterPosition());
                    movie.setExpanded(!movie.isExpanded());
                    notifyItemChanged(getAdapterPosition());

                }
            });
        }
    }

    public ExpandableAdapter(Context context, ArrayList<ExpandableModel> list){
        this.context = context;
        this.expandableModels = list;
    }

    public ArrayList<ExpandableModel> getExpandableModels(){
        return expandableModels;
    }
    @NonNull
    @Override
    public ExpandableAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.qna_design, parent, false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ExpandableAdapter.ViewHolder holder, final int position) {

        ExpandableModel expandableModel = getExpandableModels().get(position);
        holder.tvFaQTitle.setText(getExpandableModels().get(position).getTitle());
        holder.tvFaQDetails.setText(getExpandableModels().get(position).getDetails());
        boolean isExpanded = getExpandableModels().get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return getExpandableModels().size();
    }


    }
