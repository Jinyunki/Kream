package com.jyk.kreamapp.watch.filter;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.ItemAndUtils.Utils;
import com.jyk.kreamapp.R;
import com.jyk.kreamapp.watch.filter.adapter.WatchFilterAdapter;

public class WatchFiltersHolder extends RecyclerView.ViewHolder {
    RecyclerView recyclerView;
    Context context;
    WatchFilterAdapter adapter;

    public WatchFiltersHolder(@NonNull View itemView) {
        super(itemView);

        recyclerView = itemView.findViewById(R.id.rv_watch_filter);
        adapter = new WatchFilterAdapter();
    }
    public void onBind(Context context, WatchFilterAdapter adapter){

        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                outRect.left = Utils.dpToPx(itemView.getContext(), 2);
                outRect.right = Utils.dpToPx(itemView.getContext(), 2);
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);
    }
}
