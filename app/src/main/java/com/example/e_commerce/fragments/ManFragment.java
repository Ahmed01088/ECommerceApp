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
import com.example.e_commerce.adapters.MenAdapter;
import com.example.e_commerce.models.MenModel;
import com.example.e_commerce.models.WomenHomeModel;

import java.util.ArrayList;

public class ManFragment extends Fragment {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_man, container, false);
        RecyclerView items =view.findViewById(R.id.rv_men);
        ArrayList<MenModel> list=new ArrayList<>();
        list.add(new MenModel());
        list.add(new MenModel());
        list.add(new MenModel());
        list.add(new MenModel());

        GridLayoutManager layoutManager=new GridLayoutManager(getContext(),2);
        MenAdapter adapter=new MenAdapter(list);
        items.setAdapter(adapter);
        items.setLayoutManager(layoutManager);
        return view;
    }
}