package com.jyk.kreamapp.shop.alignment;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.R;

public class ShopAlignmentHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public ShopAlignmentHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.tv_simple);
    }
}