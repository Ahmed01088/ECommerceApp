package com.example.e_commerce.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.e_commerce.R;
import com.example.e_commerce.adapters.CartAdapter;
import com.example.e_commerce.models.CartModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class CartFragment extends Fragment {
   ArrayList<CartModel> cartModel=new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_cart, container, false);
        RecyclerView item_cart_rv=view.findViewById(R.id.item_cart_rv);
        cartModel.add(new CartModel());
        cartModel.add(new CartModel());
        cartModel.add(new CartModel());
        cartModel.add(new CartModel());
        cartModel.add(new CartModel());
        cartModel.add(new CartModel());
        cartModel.add(new CartModel());
        cartModel.add(new CartModel());
        cartModel.add(new CartModel());
        cartModel.add(new CartModel());
        cartModel.add(new CartModel());
        cartModel.add(new CartModel());
        cartModel.add(new CartModel());
        CartAdapter adapter = new CartAdapter(cartModel);
        item_cart_rv.setAdapter(adapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        item_cart_rv.setLayoutManager(layoutManager);
        LinearLayout checkoutBtn=view.findViewById(R.id.checkoutBtn);
        checkoutBtn.setOnClickListener(v -> {
               getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,new CheckOutFragment()).commit();

        });
        
        return view;
    }

}