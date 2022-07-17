package com.jyk.kreamapp.my.profile;

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

public class MyProfileFragment extends Fragment {
    RecyclerView recyclerView;
    MyProfileAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile,container,false);

        recyclerView = view.findViewById(R.id.rv_profile_page);
        recyclerView.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if (position == 0) {
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
                if (position+1 < spanCount) {
                    // 맨위
                    outRect.top = Utils.dpToPx(getContext(), 8);
                    outRect.bottom = Utils.dpToPx(getContext(), 3);

                } else if (position >= itemCount - remainingCount) {
                    // 맨밑
                    outRect.top = Utils.dpToPx(getContext(), 3);
                    outRect.bottom = Utils.dpToPx(getContext(), 8);
                } else {
                    // 나머지
                    outRect.top = Utils.dpToPx(getContext(), 3);
                    outRect.bottom = Utils.dpToPx(getContext(), 3);
                }

                /**
                 * HORIZONTAL
                 */
                if (column == 0) {
                    // 맨처음
                    outRect.left = Utils.dpToPx(getContext(), 8);
                    outRect.right = Utils.dpToPx(getContext(), 3);
                } else if (column == (spanCount - 1)) {
                    // 맨끝
                    outRect.left = Utils.dpToPx(getContext(), 3);
                }
            }
        });

        adapter = new MyProfileAdapter(getContext());
        adapter.addAll(DataItem.dataItems(10));
        recyclerView.setAdapter(adapter);

        return view;

    }
}
