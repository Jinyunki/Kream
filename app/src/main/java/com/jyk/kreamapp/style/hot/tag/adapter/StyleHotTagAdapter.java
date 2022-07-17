package com.jyk.kreamapp.style.hot.tag.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.R;


public class StyleHotTagAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.listitem_hot_tag_item,parent,false);

        return new StyleHotTagHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        StyleHotTagHolder styleHotTagHolder = (StyleHotTagHolder) holder;
        styleHotTagHolder.tvTag.setText("# Tags List : " + position);
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
