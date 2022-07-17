package com.jyk.kreamapp.home.info;

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


public class HomeInfoFragment extends Fragment {
    // 페이지 내에서 리사이클러뷰를 사용하기위한 준비
    RecyclerView rvSecondpageItem;
    // 리사이클러뷰를 연결해줄 어댑터를 생성
    HomeInfoAdapter homeInfoAdapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // 뷰 그룹을 통해 첫번째 레이아웃을 뷰에 담다
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_info, container, false);
        // 뷰 그룹을 통해 불러온 레이아웃안에 리사이클러뷰를 호출
        // 리사이클러뷰를 해당 뷰에 사이즈 고정
        // 레이아웃 매니저를 통해 방향성을 지정
        rvSecondpageItem = viewGroup.findViewById(R.id.rv_secondpage_item);
        rvSecondpageItem.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if (position == 0) {
                    return 2;
                } else if (position == 1) {
                    return 2;
                } else {
                    return 1;
                }
            }
        });
        rvSecondpageItem.setLayoutManager(gridLayoutManager);
        rvSecondpageItem.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                outRect.top = Utils.dpToPx(getContext(), 10);

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
                    outRect.right = Utils.dpToPx(getContext(), 8);
                } else {
                    // 나머지
                    outRect.left = Utils.dpToPx(getContext(), 3);
                    outRect.right = Utils.dpToPx(getContext(), 3);
                }
            }
        });
        homeInfoAdapter = new HomeInfoAdapter(getContext());
        homeInfoAdapter.addAll(DataItem.dataItems(20));
        rvSecondpageItem.setAdapter(homeInfoAdapter);
        return viewGroup;
    }
}


