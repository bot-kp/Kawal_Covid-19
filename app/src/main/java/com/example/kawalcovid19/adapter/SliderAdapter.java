package com.example.kawalcovid19.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.kawalcovid19.R;
import com.example.kawalcovid19.model.SliderModel;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SliderAdapterHolder> {
    private List<SliderModel> sliderModels;
    private ViewPager2 viewPager2;
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            sliderModels.addAll(sliderModels);
            notifyDataSetChanged();
        }
    };

    public SliderAdapter(List<SliderModel> sliderModels, ViewPager2 viewPager2) {
        this.sliderModels = sliderModels;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SliderAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SliderAdapterHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.slider_image,
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull SliderAdapterHolder holder, int position) {
        holder.setImage(sliderModels.get(position));
        if (position == sliderModels.size() - 2) {
            viewPager2.post(runnable);
        }
    }

    @Override
    public int getItemCount() {
        return sliderModels.size();
    }

    static class SliderAdapterHolder extends RecyclerView.ViewHolder {
        private RoundedImageView roundedImageView;

        public SliderAdapterHolder(@NonNull View itemView) {
            super(itemView);
            roundedImageView = itemView.findViewById(R.id.slier_img);

        }

        void setImage(SliderModel sliderModel) {
            roundedImageView.setImageResource(sliderModel.getImage());
        }
    }
}
