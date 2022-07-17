package com.jyk.kreamapp.home.info.product;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.R;

public class HomeInfoProductsHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView tvName;

    public HomeInfoProductsHolder(@NonNull View itemView) {
        super(itemView);

        tvName = itemView.findViewById(R.id.tv_name);
    }
}
