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
            position = 0;
            holder.subdistrictNameText1.setText(subdistrics.get(position).getName());
            holder.subdistrictPositiveTotalText1.setText(subdistrics.get(position).getPositive());
            holder.subdistrictPDPTotalText1.setText(subdistrics.get(position).getPdp());
            holder.subdistrictODPTotalText1.setText(subdistrics.get(position).getOdp());
            position++;
            holder.subdistrictNameText2.setText(subdistrics.get(position).getName());
            holder.subdistrictPositiveTotalText2.setText(subdistrics.get(position).getPositive());
            holder.subdistrictPDPTotalText2.setText(subdistrics.get(position).getPdp());
            holder.subdistrictODPTotalText2.setText(subdistrics.get(position).getOdp());
            position++;
            holder.subdistrictNameText3.setText(subdistrics.get(position).getName());
            holder.subdistrictPositiveTotalText3.setText(subdistrics.get(position).getPositive());
            holder.subdistrictPDPTotalText3.setText(subdistrics.get(position).getPdp());
            holder.subdistrictODPTotalText3.setText(subdistrics.get(position).getOdp());
            position++;
            holder.subdistrictNameText4.setText(subdistrics.get(position).getName());
            holder.subdistrictPositiveTotalText4.setText(subdistrics.get(position).getPositive());
            holder.subdistrictPDPTotalText4.setText(subdistrics.get(position).getPdp());
            holder.subdistrictODPTotalText4.setText(subdistrics.get(position).getOdp());

        }

        @Override
        public int getItemCount() {
            return subdistrics.size();
        }

        class DetailComponentViewHolder extends RecyclerView.ViewHolder {
            public final View view;
            CardView statisticDetailCard1;
            CardView statisticDetailCard2;
            CardView statisticDetailCard3;
            CardView statisticDetailCard4;
            TextView subdistrictNameText1;
            TextView subdistrictNameText2;
            TextView subdistrictNameText3;
            TextView subdistrictNameText4;
            TextView subdistrictPositiveTotalText1;
            TextView subdistrictPositiveTotalText2;
            TextView subdistrictPositiveTotalText3;
            TextView subdistrictPositiveTotalText4;
            TextView subdistrictODPTotalText1;
            TextView subdistrictODPTotalText2;
            TextView subdistrictODPTotalText3;
            TextView subdistrictODPTotalText4;
            TextView subdistrictPDPTotalText;
            TextView subdistrictPDPTotalText1;
            TextView subdistrictPDPTotalText2;
            TextView subdistrictPDPTotalText3;
            TextView subdistrictPDPTotalText4;


            public DetailComponentViewHolder(@NonNull View itemView) {
                super(itemView);
                view = itemView;

                statisticDetailCard1 = view.findViewById(R.id.subdistric_card_1);
                statisticDetailCard2 = view.findViewById(R.id.subdistric_card_2);
                statisticDetailCard3 = view.findViewById(R.id.subdistric_card_3);
                statisticDetailCard4 = view.findViewById(R.id.subdistric_card_4);
                subdistrictNameText1 = view.findViewById(R.id.subdistric_name_1);
                subdistrictNameText2 = view.findViewById(R.id.subdistric_name_2);
                subdistrictNameText3 = view.findViewById(R.id.subdistric_name_3);
                subdistrictNameText4 = view.findViewById(R.id.subdistric_name_4);
                subdistrictPositiveTotalText1 = view.findViewById(R.id.positive_count_subdistric_1);
                subdistrictPositiveTotalText2 = view.findViewById(R.id.positive_count_subdistric_2);
                subdistrictPositiveTotalText3 = view.findViewById(R.id.positive_count_subdistric_3);
                subdistrictPositiveTotalText4 = view.findViewById(R.id.positive_count_subdistric_4);
                subdistrictODPTotalText1 = view.findViewById(R.id.odp_count_subdistric_1);
                subdistrictODPTotalText2 = view.findViewById(R.id.odp_count_subdistric_2);
                subdistrictODPTotalText3 = view.findViewById(R.id.odp_count_subdistric_3);
                subdistrictODPTotalText4 = view.findViewById(R.id.odp_count_subdistric_4);
                subdistrictPDPTotalText1 = view.findViewById(R.id.pdp_count_subdistric_1);
                subdistrictPDPTotalText2 = view.findViewById(R.id.pdp_count_subdistric_2);
                subdistrictPDPTotalText3 = view.findViewById(R.id.pdp_count_subdistric_3);
                subdistrictPDPTotalText4 = view.findViewById(R.id.pdp_count_subdistric_4);
            }
        }
    }
}