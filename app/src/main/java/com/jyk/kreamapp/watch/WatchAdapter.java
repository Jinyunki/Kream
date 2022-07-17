package com.jyk.kreamapp.watch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.ItemAndUtils.DataItem;
import com.jyk.kreamapp.R;
import com.jyk.kreamapp.watch.filter.WatchFiltersHolder;
import com.jyk.kreamapp.watch.filter.adapter.WatchFilterAdapter;
import com.jyk.kreamapp.watch.youtube.WatchYoutubeHolder;

import java.util.ArrayList;

public class WatchAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<DataItem> dataItems = new ArrayList<DataItem>();

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view;
        if (viewType == DataItem.WATCH_PAGE_FILTER){
            view = inflater.inflate(R.layout.listitem_watch_filter, parent, false);
            return new WatchFiltersHolder(view);
        } else {
            view = inflater.inflate(R.layout.listitem_watch_youtube, parent, false);
            return new WatchYoutubeHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int viewType = getItemViewType(position);

        if (viewType == DataItem.WATCH_PAGE_FILTER){
            WatchFiltersHolder watchFiltersHolder = (WatchFiltersHolder) holder;
            watchFiltersHolder.onBind(context, new WatchFilterAdapter());
        } else {
            WatchYoutubeHolder watchYoutubeHolder = (WatchYoutubeHolder) holder;
            watchYoutubeHolder.textView.setText(""+position+" ST Name");
        }
    }

    @Override
    public int getItemCount() {
        return 1 + dataItems.size();
    }

    public void addAll(ArrayList<DataItem> items) {
        dataItems.clear();
        dataItems.addAll(items);
    }

    public void addItem(DataItem item) {
        dataItems.add(item);
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return DataItem.WATCH_PAGE_FILTER;
        } else if (position == 1) {
            return DataItem.WATCH_PAGE_YOUTUBE;
        } else {
            return -1;
        }
    }
}
