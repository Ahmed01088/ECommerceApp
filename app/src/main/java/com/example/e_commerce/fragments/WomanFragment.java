package com.example.e_commerce.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.e_commerce.R;
import com.example.e_commerce.adapters.CatalogAdapter;
import com.example.e_commerce.adapters.WomenAdapter;
import com.example.e_commerce.models.BestSellerModel;
import com.example.e_commerce.models.WomenHomeModel;

import java.util.ArrayList;

public class WomanFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_woman, container, false);
        RecyclerView items =view.findViewById(R.id.rv_women);
        ArrayList<WomenHomeModel> list=new ArrayList<>();
        list.add(new WomenHomeModel());
        list.add(new WomenHomeModel());
        list.add(new WomenHomeModel());
        list.add(new WomenHomeModel());
        list.add(new WomenHomeModel());
        GridLayoutManager layoutManager=new GridLayoutManager(getContext(),2);
        WomenAdapter adapter=new WomenAdapter(list);
        items.setAdapter(adapter);
        items.setLayoutManager(layoutManager);
        return view;    }
}