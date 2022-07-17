package com.jyk.kreamapp.home;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.jyk.kreamapp.R;


public class HomeFragment extends Fragment {

    // Viewpager2 사용 준비
    ViewPager2 viewPager2;
    // ViewpagerAdapter 생성 및 사용 준비
    HomeAdapter homeAdapter;

    // 탭 레이아웃의 텍스트 지정을 해주기위해 배열에 각각의 텍스트를 넣어준다
    String[] tabNames = new String[]{"투데이","발매정보"};
    // 탭 레이아웃 사용 준비
    TabLayout tabLayout;



    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        // mainViewPager2를 id 호출
        viewPager2 = view.findViewById(R.id.vp_home_main);
        // mainAdapter 영역 확보,및 파라미터 지정
        homeAdapter = new HomeAdapter(getActivity(),2);
        // viewpager2에 메인어댑터를 연결
        viewPager2.setAdapter(homeAdapter);
        // 뷰페이저의 방향성을 지정
        viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        // 액티비티 메인에 있는 탭 레이아웃을 호출해준다
        tabLayout = view.findViewById(R.id.tab_layout_home);
        // 탭 레이아웃의 컬러를 지정
        int greyColor = getActivity().getColor(R.color.grey);
        int blackColor = getActivity().getColor(R.color.black);
        // 탭 레이아웃의 텍스트컬러를 정해준다
        tabLayout.setTabTextColors(greyColor, blackColor);
        // 탭 레이아웃의 선택된 스크롤바 컬러
        tabLayout.setSelectedTabIndicatorColor(blackColor);
        // 탭 레이아웃의 사이즈를 텍스트크기에 맞춰준다
        tabLayout.setTabIndicatorFullWidth(false);
        // 탭 레이아웃의 위치를 중앙으로 정렬
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        // 탭레이아웃의 기능을 넣어줄 메서드
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                // 위쪽에 정해준 배열에 각각의 포지션을 반환
                tab.setText(tabNames[position]);
            }
        }).attach();
        return view;
    }
}
