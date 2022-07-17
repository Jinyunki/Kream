package com.jyk.kreamapp.shop;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.ItemAndUtils.DataItem;
import com.jyk.kreamapp.ItemAndUtils.Utils;
import com.jyk.kreamapp.R;

import java.util.ArrayList;

public class ShopFragment extends Fragment {
    RecyclerView recyclerView;
    ShopAdapter adapter;
    ArrayList<DataItem> data = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = (View) inflater.inflate(R.layout.fragment_shop, container, false);

        recyclerView = view.findViewById(R.id.rv_shop);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if (position == 0) {
                    return 2;
                } else if (position == 1) {
                    return 2;
                } else if (position == 2) {
                    return 2;
                } else if (position == 3) {
                    return 2;
                } else {
                    return 1;
                }
            }
        });
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                outRect.top = Utils.dpToPx(getActivity(), 10);

                int position = parent.getChildAdapterPosition(view);
                // 레이아웃 스팬 갯수
                int spanCount = gridLayoutManager.getSpanCount();
                // 아이템 카운트(총갯수)
                int itemCount = state.getItemCount();

                int column = position % spanCount;
                int remainingCount = itemCount % spanCount;

                /**
                 * VERTICAL
                 */
                if (position < spanCount) {
                    // 맨위
                    outRect.top = Utils.dpToPx(getActivity(), 8);
                    outRect.bottom = Utils.dpToPx(getActivity(), 3);

                } else if (position >= itemCount - remainingCount) {
                    // 맨밑
                    outRect.top = Utils.dpToPx(getActivity(), 3);
                    outRect.bottom = Utils.dpToPx(getActivity(), 8);
                } else {
                    // 나머지
                    outRect.top = Utils.dpToPx(getActivity(), 3);
                    outRect.bottom = Utils.dpToPx(getActivity(), 3);
                }

                /**
                 * HORIZONTAL
                 */
                if (column == 0) {
                    // 맨처음
                    outRect.left = Utils.dpToPx(getActivity(), 8);
                    outRect.right = Utils.dpToPx(getActivity(), 3);
                } else if (column == (spanCount - 1)) {
                    // 맨끝
                    outRect.left = Utils.dpToPx(getActivity(), 3);
                    outRect.right = Utils.dpToPx(getActivity(), 8);
                } else {
                    // 나머지
                    outRect.left = Utils.dpToPx(getActivity(), 3);
                    outRect.right = Utils.dpToPx(getActivity(), 3);
                }
            }
        });
        adapter = new ShopAdapter(getContext(), getChildFragmentManager(), getLifecycle(), 10);
        adapter.addAll(DataItem.dataItems(20));
        recyclerView.setAdapter(adapter);
        return view;
    }
}

