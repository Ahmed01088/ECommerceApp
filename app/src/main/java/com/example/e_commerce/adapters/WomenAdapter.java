package com.example.e_commerce.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.e_commerce.R;
import com.example.e_commerce.models.MenModel;
import com.example.e_commerce.models.WomenHomeModel;

import java.util.ArrayList;

public class WomenAdapter extends RecyclerView.Adapter<WomenAdapter.ViewHolder> {
    public WomenAdapter(ArrayList<WomenHomeModel> womenHomeModels) {
        this.womenHomeModels = womenHomeModels;
    }

    ArrayList<WomenHomeModel>womenHomeModels=new ArrayList<>();


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_women_home,parent,false);
                return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return womenHomeModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
