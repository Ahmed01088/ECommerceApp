package com.example.e_commerce.adapters;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.e_commerce.R;
import com.example.e_commerce.models.CartModel;

import java.util.ArrayList;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {
     ArrayList<CartModel> cartModels;


    public CartAdapter(ArrayList<CartModel> cartModels) {
        this.cartModels = cartModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart,parent,false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
               holder.addBtn.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       int no=Integer.parseInt(holder.viewBtn.getText().toString());
                       no++;
                       if (no >= 0) {
                           holder.viewBtn.setText(""+no);

                       }else {
                           holder.viewBtn.setText("0");

                       }
                   }
               });
        holder.minBtn.setOnClickListener(v -> {
            int no=Integer.parseInt(holder.viewBtn.getText().toString());
            no--;
            if (no >= 0) {
                holder.viewBtn.setText(""+no);

            }else {
                holder.viewBtn.setText("0");

            }
        });
        holder.deleteBtn.setOnClickListener(e->{
            cartModels.remove(cartModels.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return cartModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView addBtn,minBtn,deleteBtn;
        TextView viewBtn;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            addBtn=itemView.findViewById(R.id.addBtn);
            minBtn=itemView.findViewById(R.id.minBtn);
            viewBtn=itemView.findViewById(R.id.viewNo);
            deleteBtn=itemView.findViewById(R.id.deleteBtn);
        }
    }
}
