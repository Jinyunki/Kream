package com.jyk.kreamapp.home.info.category.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.R;

public class HomeInfoCategoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.listitem_info_category_item,parent,false);

        return new HomeInfoCategoryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        HomeInfoCategoryHolder homeInfoCategoryHolder = (HomeInfoCategoryHolder) holder;
        homeInfoCategoryHolder.tvTab.setText("TABS_ITEM : " + position);
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
