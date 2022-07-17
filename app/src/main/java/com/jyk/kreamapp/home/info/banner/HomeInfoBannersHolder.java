package com.jyk.kreamapp.home.info.banner;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.R;

public class HomeInfoBannersHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    public HomeInfoBannersHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.iv_draw_item);
    }
}
