package com.jyk.kreamapp.style.latest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.ItemAndUtils.DataItem;
import com.jyk.kreamapp.R;
import com.jyk.kreamapp.style.hot.profile.StyleHotProfileHolder;

import java.util.ArrayList;

public class StyleLatestAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<DataItem> dataItems = new ArrayList<>();

    public StyleLatestAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view;

        view = inflater.inflate(R.layout.listitem_hot_profile, parent, false);
        return new StyleHotProfileHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        StyleHotProfileHolder styleHotProfileHolder = (StyleHotProfileHolder) holder;
        styleHotProfileHolder.tv_id.setText("Name : " + position);
    }

    public void addItem(DataItem item) {
        this.dataItems.add(item);
    }

    public void addAll(ArrayList<DataItem> items) {
        this.dataItems.clear();
        this.dataItems.addAll(items);
    }

    @Override
    public int getItemCount() {
        return dataItems.size();
    }
}
