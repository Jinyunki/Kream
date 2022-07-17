package com.jyk.kreamapp.home.today.category.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.ItemAndUtils.SquareImageView;
import com.jyk.kreamapp.R;


public class HomeCategoryHolder extends RecyclerView.ViewHolder {
    public SquareImageView imageView;
    public TextView textView;
    public HomeCategoryHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.iv_category_item);
        textView = itemView.findViewById(R.id.tv_category_item);
    }
}
