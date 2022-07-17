package com.jyk.kreamapp.home.today.product;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.ItemAndUtils.Utils;
import com.jyk.kreamapp.R;
import com.jyk.kreamapp.home.today.product.adapter.HomeProductAdapter;

public class HomeProductsHolder extends RecyclerView.ViewHolder {
    public RecyclerView recyclerView;

    public HomeProductsHolder(@NonNull View itemView) {
        super(itemView);
        recyclerView = itemView.findViewById(R.id.rv_product);
    }

    public void onBind(Context context, HomeProductAdapter adapter){

        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                outRect.left = Utils.dpToPx(context,2);
                outRect.right = Utils.dpToPx(context,2);
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);
    }
}
