package com.jyk.kreamapp.shop.category;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.ItemAndUtils.Utils;
import com.jyk.kreamapp.R;
import com.jyk.kreamapp.shop.category.adapter.ShopCategoryAdapter;

public class ShopCategoriseHolder extends RecyclerView.ViewHolder {
    public RecyclerView rvDetail;
    public ShopCategoriseHolder(@NonNull View itemView) {
        super(itemView);

        rvDetail = itemView.findViewById(R.id.rv_detail_filter);
    }

    public void onBind(Context context, ShopCategoryAdapter adapter){
        rvDetail.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                outRect.left = Utils.dpToPx(itemView.getContext(), 2);
                outRect.right = Utils.dpToPx(itemView.getContext(), 2);
            }
        });
        rvDetail.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false));
        rvDetail.setAdapter(adapter);
    }
}