package com.jyk.kreamapp.home.today.product.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.ItemAndUtils.SquareImageView;
import com.jyk.kreamapp.R;

public class HomeProductHolder extends RecyclerView.ViewHolder {
    public SquareImageView ivProduct;
    public ImageView ivBookmark;
    public TextView tvBrand;
    public TextView tvName;
    public TextView tvPrice;
    public TextView tvHint;

    public HomeProductHolder(@NonNull View itemView) {
        super(itemView);

        ivProduct = itemView.findViewById(R.id.iv_capture);
        ivBookmark = itemView.findViewById(R.id.iv_bookmark);
        tvBrand = itemView.findViewById(R.id.tv_brand);
        tvName = itemView.findViewById(R.id.tv_name);
        tvPrice = itemView.findViewById(R.id.tv_product_price);
        tvHint = itemView.findViewById(R.id.tv_product_price_hint);
    }
}
