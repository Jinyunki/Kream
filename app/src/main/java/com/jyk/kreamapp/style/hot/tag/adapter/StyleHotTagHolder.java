package com.jyk.kreamapp.style.hot.tag.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.R;


public class StyleHotTagHolder extends RecyclerView.ViewHolder {
    public TextView tvTag;

    public StyleHotTagHolder(@NonNull View itemView) {
        super(itemView);

        tvTag = itemView.findViewById(R.id.tv_tag_item);
    }
}
