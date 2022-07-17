package com.jyk.kreamapp.style.hot.tag;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.ItemAndUtils.Utils;
import com.jyk.kreamapp.R;
import com.jyk.kreamapp.style.hot.tag.adapter.StyleHotTagAdapter;


public class StyleHotTagsHolder extends RecyclerView.ViewHolder {
    RecyclerView recyclerView;

    public StyleHotTagsHolder(@NonNull View itemView) {
        super(itemView);
        recyclerView = itemView.findViewById(R.id.rv_style_hot_tag);
    }

    public void onBind(Context context, StyleHotTagAdapter adapter){

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
