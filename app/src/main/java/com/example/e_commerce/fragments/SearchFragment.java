package com.example.e_commerce.fragments;

import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.e_commerce.R;
import com.example.e_commerce.adapters.SearchAdapter;
import com.example.e_commerce.models.SearchModel;

import java.util.ArrayList;

public class SearchFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<SearchModel>list=new ArrayList<>();
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        SearchView searchView=view.findViewById(R.id.searchView);
        RecyclerView recyclerView=view.findViewById(R.id.rv_search);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                String s= searchView.getQuery().toString();
                list.add(new SearchModel(s));
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                return false;
            }
        });
        SearchAdapter adapter=new SearchAdapter(list);
        recyclerView.setAdapter(adapter);
        GridLayoutManager layoutManager=new GridLayoutManager(getContext(),4);

        recyclerView.setLayoutManager(layoutManager);
        return view;

    }
}