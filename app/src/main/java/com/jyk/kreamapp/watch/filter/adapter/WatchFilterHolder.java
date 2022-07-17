package com.jyk.kreamapp.watch.filter.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.R;

public class WatchFilterHolder extends RecyclerView.ViewHolder {
    TextView textView;

    public WatchFilterHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.tv_brand_name);
    }
}
