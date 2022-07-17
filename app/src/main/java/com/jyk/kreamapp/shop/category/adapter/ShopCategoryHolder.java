package com.jyk.kreamapp.shop.category.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.R;

public class ShopCategoryHolder extends RecyclerView.ViewHolder {
    TextView textView;
    public ShopCategoryHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.tv_detail_filter_item);
    }
}
