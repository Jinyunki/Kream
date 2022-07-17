package com.jyk.kreamapp.style.following;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.jyk.kreamapp.ItemAndUtils.Utils;
import com.jyk.kreamapp.R;
import com.jyk.kreamapp.style.following.product.StyleFollowingProductAdapter;
import com.jyk.kreamapp.style.following.capture.StyleFollowingCaptureAdapter;

public class StyleFollowingHolder extends RecyclerView.ViewHolder {
    ViewPager2 vpCapture;
    RecyclerView recyclerView;
    TextView textView;

    public StyleFollowingHolder(@NonNull View itemView) {
        super(itemView);

        vpCapture = itemView.findViewById(R.id.vp_capture);
        recyclerView = itemView.findViewById(R.id.rv_tag_product);
        textView = itemView.findViewById(R.id.tv_text);

        StyleFollowingCaptureAdapter adapter = new StyleFollowingCaptureAdapter(new FragmentActivity(), 5);
        vpCapture.setAdapter(adapter);
        vpCapture.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
    }

    public void onBind(Context context, StyleFollowingProductAdapter adapter) {

        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                outRect.left = Utils.dpToPx(itemView.getContext(), 2);
                outRect.right = Utils.dpToPx(itemView.getContext(), 2);
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);
    }
}
