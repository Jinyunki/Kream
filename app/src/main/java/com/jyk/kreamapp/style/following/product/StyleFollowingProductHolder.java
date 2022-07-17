package com.jyk.kreamapp.style.following.product;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.R;


public class StyleFollowingProductHolder extends RecyclerView.ViewHolder {
    public TextView tvPrice;

    public StyleFollowingProductHolder(@NonNull View itemView) {
        super(itemView);

        tvPrice = itemView.findViewById(R.id.tv_price);
    }
}
