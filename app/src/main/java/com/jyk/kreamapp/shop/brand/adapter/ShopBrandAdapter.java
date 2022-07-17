package com.jyk.kreamapp.shop.brand.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.R;

public class ShopBrandAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.fragment_shop_brand_item,parent,false);

        return new ShopBrandHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ShopBrandHolder itemHolder = (ShopBrandHolder) holder;
        itemHolder.textView.setText(String.valueOf(position + " 번째 브랜드 "));
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}