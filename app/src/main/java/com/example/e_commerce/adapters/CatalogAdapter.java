package com.example.e_commerce.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.e_commerce.R;
import com.example.e_commerce.models.CartModel;
import com.example.e_commerce.models.CatalogModel;

import java.util.ArrayList;

public class CatalogAdapter extends RecyclerView.Adapter<CatalogAdapter.ViewHolder> {
    ArrayList<CatalogModel> catalogModel;

    public CatalogAdapter(ArrayList<CatalogModel> catalogModel) {
        this.catalogModel = catalogModel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_catalog, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<CartModel> cart_item=new ArrayList<>();
                cart_item.add(new CartModel());
            }
        });
        holder.heart.setOnClickListener(e->{
            holder.heart.setImageResource(R.drawable.red_heart);

        });
        int drawableReourceId = holder.itemView.getContext().getResources()
                .getIdentifier(catalogModel.get(position).getPicture(), "drawable",
                        holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext())
                .load(drawableReourceId)
                .into(holder.picture);
        holder.name.setText(catalogModel.get(position).getNameOpProduct());
        holder.price.setText(String.format("$%s", catalogModel.get(position).getPrice()));

    }

    @Override
    public int getItemCount() {
        return catalogModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView addToCart,picture;
        ImageView heart;
        TextView price ,name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            addToCart=itemView.findViewById(R.id.addtocartAll);
            heart=itemView.findViewById(R.id.heartAll);
            picture=itemView.findViewById(R.id.picAll);
            price =itemView.findViewById(R.id.priceAll);
            name =itemView.findViewById(R.id.nameAll);

        }
    }
}
