package com.jyk.kreamapp.shop.brand;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.ItemAndUtils.Utils;
import com.jyk.kreamapp.R;
import com.jyk.kreamapp.shop.brand.adapter.ShopBrandAdapter;

public class ShopBrandsHolder extends RecyclerView.ViewHolder {
    public RecyclerView rvBrand;
    public ShopBrandsHolder(@NonNull View itemView) {
        super(itemView);

        rvBrand = itemView.findViewById(R.id.rv_brand_filter);
    }

    public void onBind(Context context, ShopBrandAdapter adapter){
        rvBrand.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                outRect.left = Utils.dpToPx(itemView.getContext(), 2);
                outRect.right = Utils.dpToPx(itemView.getContext(), 2);
            }
        });
        rvBrand.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false));
        rvBrand.setAdapter(adapter);
    }
}
