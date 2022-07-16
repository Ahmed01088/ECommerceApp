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
import com.example.e_commerce.models.CatalogModel;

import java.util.ArrayList;

public class AllFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_all, container, false);
        RecyclerView items =view.findViewById(R.id.items_catalog);
        ArrayList<CatalogModel> list=new ArrayList<>();
        GridLayoutManager layoutManager=new GridLayoutManager(getContext(),2);
        list.add(new CatalogModel("imageman2","Image1",20));
        list.add(new CatalogModel("imagewoman5","Image2",25));
        list.add(new CatalogModel("imageman3","Image3",30));
        list.add(new CatalogModel("red_dress","Image4",20));
        list.add(new CatalogModel("imagewoman3","Image5",60));
        list.add(new CatalogModel("imageman4","Image6",80));

        CatalogAdapter adapter=new CatalogAdapter(list);
        items.setAdapter(adapter);
        items.setLayoutManager(layoutManager);
        return view;
    }
}