package com.jyk.kreamapp.shop.banner;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.jyk.kreamapp.R;

public class ShopBannersHolder extends RecyclerView.ViewHolder {
    public ViewPager2 viewPager2;

    public ShopBannersHolder(@NonNull View itemView) {
        super(itemView);

        viewPager2 = itemView.findViewById(R.id.vp_banner);
    }
}