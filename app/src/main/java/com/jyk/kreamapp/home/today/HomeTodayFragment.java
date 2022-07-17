package com.jyk.kreamapp.home.today;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.ItemAndUtils.DataItem;
import com.jyk.kreamapp.R;

public class HomeTodayFragment extends Fragment {
    // 페이지 내에서 리사이클러뷰를 사용하기위한 준비
    RecyclerView rvFirstpageItem;
    // 리사이클러뷰를 연결해줄 어댑터를 생성
    HomeTodayAdapter homeTodayAdapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // 뷰 그룹을 통해 첫번째 레이아웃을 뷰에 담다
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_today, container, false);

        // 뷰 그룹을 통해 불러온 레이아웃안에 리사이클러뷰를 호출
        // 리사이클러뷰를 해당 뷰에 사이즈 고정
        // 레이아웃 매니저를 통해 방향성을 지정
        rvFirstpageItem = viewGroup.findViewById(R.id.rv_firstpage_item);
        rvFirstpageItem.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvFirstpageItem.setHasFixedSize(true);

        // 리사이클러뷰 어댑터 메모리확보
        // 데이터 > DataItem.Class를 통해 주입
        // 리사이클러뷰에 어댑터 연결
        homeTodayAdapter = new HomeTodayAdapter(getActivity(), getChildFragmentManager(), getLifecycle(), 5);
        homeTodayAdapter.addAll(DataItem.dataItems(1));
        rvFirstpageItem.setAdapter(homeTodayAdapter);
        return viewGroup;
    }

}
