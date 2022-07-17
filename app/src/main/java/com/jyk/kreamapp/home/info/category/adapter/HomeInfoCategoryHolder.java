package com.jyk.kreamapp.home.info.category.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.R;

public class HomeInfoCategoryHolder extends RecyclerView.ViewHolder {
    public TextView tvTab;

    public HomeInfoCategoryHolder(@NonNull View itemView) {
        super(itemView);

        tvTab = itemView.findViewById(R.id.tv_tab_item);
    }
}
