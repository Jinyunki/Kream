package com.jyk.kreamapp.watch.filter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.R;

public class WatchFilterAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.listitem_watch_filter_item,parent,false);

        return new WatchFilterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        WatchFilterHolder watchFilterHolder = (WatchFilterHolder) holder;
        watchFilterHolder.textView.setText(""+position+" ST Brand");


    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
