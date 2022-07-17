package com.jyk.kreamapp.shop.product;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.R;

public class ShopProductHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public ShopProductHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.tv_product_brand);
    }
}