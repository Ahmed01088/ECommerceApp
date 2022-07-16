package com.example.e_commerce.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.e_commerce.R;
import com.example.e_commerce.adapters.BestSellerAdapter;
import com.example.e_commerce.adapters.CatalogAdapter;
import com.example.e_commerce.models.BestSellerModel;
import com.example.e_commerce.models.CatalogModel;
import com.example.e_commerce.models.WomenHomeModel;

import java.util.ArrayList;

public class BestSellarFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_best_sellar, container, false);
        RecyclerView items =view.findViewById(R.id.rv_bestseller);
        ArrayList<BestSellerModel> list=new ArrayList<>();
        list.add(new BestSellerModel());
        list.add(new BestSellerModel());
        list.add(new BestSellerModel());
        list.add(new BestSellerModel());
        list.add(new BestSellerModel());

        GridLayoutManager layoutManager=new GridLayoutManager(getContext(),2);
        BestSellerAdapter adapter=new BestSellerAdapter(list);
        items.setAdapter(adapter);
        items.setLayoutManager(layoutManager);
        return view;
    }
}