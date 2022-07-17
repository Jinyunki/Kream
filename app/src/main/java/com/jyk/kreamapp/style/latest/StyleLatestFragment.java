package com.jyk.kreamapp.style.latest;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.ItemAndUtils.DataItem;
import com.jyk.kreamapp.ItemAndUtils.Utils;
import com.jyk.kreamapp.R;

public class StyleLatestFragment extends Fragment {
    RecyclerView recyclerView;

    StyleLatestAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_latest,container,false);

        recyclerView = viewGroup.findViewById(R.id.rv_style_latest_vertical);
        recyclerView.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                outRect.top = Utils.dpToPx(getContext(),10);
                int position = parent.getChildAdapterPosition(view);
                int spanCount = gridLayoutManager.getSpanCount();
                int itemCount = state.getItemCount();
                int column = position % spanCount;
                int remainingCount = itemCount % spanCount;

                if (column == 0) {
                    // 맨처음
                    outRect.left = Utils.dpToPx(getContext(),6);
                    outRect.right = Utils.dpToPx(getContext(),3);
                } else {
                    outRect.left = Utils.dpToPx(getContext(),3);
                    outRect.right = Utils.dpToPx(getContext(),6);
                }
            }
        });

        adapter = new StyleLatestAdapter(getContext());
        adapter.addAll(DataItem.dataItems(10));
        recyclerView.setAdapter(adapter);
        return viewGroup;
    }
}
