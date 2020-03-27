package com.example.kawalcovid19.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kawalcovid19.R;
import com.example.kawalcovid19.model.statistics.Subdistric;

import java.util.List;

public class StatisticDetailAdaptor {
    public static class ParentGrid extends RecyclerView.Adapter<ParentGrid.ParentGridViewHolder> {
        private Context context;
        private List<List<Subdistric>> subdistrics;
        private RecyclerView.Adapter mAdapter;

        public ParentGrid(android.content.Context context, List<List<Subdistric>> subdistrics) {
            this.context = context;
            this.subdistrics = subdistrics;
        }

        @NonNull
        @Override
        public ParentGridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.statistic_detail_grid, parent, false);

            return new ParentGridViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ParentGridViewHolder holder, int position) {
            mAdapter = new StatisticDetailAdaptor.DetailComponent(context, subdistrics.get(position));
            holder.statisticDetailChildGrid.setAdapter(mAdapter);
        }

        @Override
        public int getItemCount() {
            return subdistrics.size();
        }

        class ParentGridViewHolder extends RecyclerView.ViewHolder {
            public final View view;
            RecyclerView statisticDetailChildGrid;

            public ParentGridViewHolder(@NonNull View itemView) {
                super(itemView);
                view = itemView;

                statisticDetailChildGrid = view.findViewById(R.id.subdistrict_child_grid_recycler);
            }
        }
    }

    public static class DetailComponent extends RecyclerView.Adapter<DetailComponent.DetailComponentViewHolder> {
        private Context context;
        private List<Subdistric> subdistrics;

        public DetailComponent(Context context, List<Subdistric> subdistrics) {
            this.context = context;
            this.subdistrics = subdistrics;
        }

        @NonNull
        @Override
        public DetailComponentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.statistic_detail, parent, false);
            return new DetailComponentViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull DetailComponentViewHolder holder, int position) {
//            holder.statisticDetailCard.
            holder.subdistrictNameText.setText(subdistrics.get(position).getName());
            holder.subdistrictPositiveTotalText.setText(subdistrics.get(position).getPositive());
            // TODO current data not available
            holder.subdistrictRecoveredTotalText.setText("0");
            // TODO current data not available
            holder.subdistrictDeadTotalText.setText("0");
        }

        @Override
        public int getItemCount() {
            return subdistrics.size();
        }

        class DetailComponentViewHolder extends RecyclerView.ViewHolder {
            public final View view;
            CardView statisticDetailCard;
            TextView subdistrictNameText;
            TextView subdistrictPositiveTotalText;
            TextView subdistrictRecoveredTotalText;
            TextView subdistrictDeadTotalText;


            public DetailComponentViewHolder(@NonNull View itemView) {
                super(itemView);
                view = itemView;

                statisticDetailCard = view.findViewById(R.id.statistic_detail_card);
                subdistrictNameText = view.findViewById(R.id.subdistric_name);
                subdistrictPositiveTotalText = view.findViewById(R.id.subdistric_positive_total);
                subdistrictRecoveredTotalText = view.findViewById(R.id.subdistric_recovered_total);
                subdistrictDeadTotalText = view.findViewById(R.id.subdistric_dead_total);
            }
        }
    }
}