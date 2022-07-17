package com.jyk.kreamapp.shop.brand.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.R;

public class ShopBrandHolder extends RecyclerView.ViewHolder {
    TextView textView;
    public ShopBrandHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.tv_brand_filter_item);
    }
}
