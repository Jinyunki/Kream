package com.jyk.kreamapp.home.today.category;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.ItemAndUtils.Utils;
import com.jyk.kreamapp.R;
import com.jyk.kreamapp.home.today.category.adapter.HomeCategoryAdapter;

public class HomeCategoriseHolder extends RecyclerView.ViewHolder {
    public RecyclerView recyclerView;

    public HomeCategoriseHolder(@NonNull View itemView) {
        super(itemView);
        recyclerView = itemView.findViewById(R.id.rv_category);
    }

    public void onBind(Context context, HomeCategoryAdapter adapter, int spanCount){

        GridLayoutManager gridLayoutManager = new GridLayoutManager(context,spanCount);
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                outRect.left = Utils.dpToPx(context,1);
                outRect.right = Utils.dpToPx(context,1);
            }
        });
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}
