package com.jyk.kreamapp.style;

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

public class StyleFragment extends Fragment {
    ViewPager2 viewPager2;
    StyleAdapter styleAdapter;

    String[] tabNames = new String[]{"인기","최신","팔로잉"};
    TabLayout tabLayout;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = (View) inflater.inflate(R.layout.fragment_style,container,false);

        viewPager2 = view.findViewById(R.id.vp_style_main);
        styleAdapter = new StyleAdapter(getActivity(),3);
        viewPager2.setAdapter(styleAdapter);
        viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        tabLayout = view.findViewById(R.id.tab_layout_style);
        // 탭 레이아웃의 컬러를 지정
        int greyColor = getActivity().getColor(R.color.grey);
        int blackColor = getActivity().getColor(R.color.black);
        tabLayout.setTabTextColors(greyColor, blackColor);
        tabLayout.setSelectedTabIndicatorColor(blackColor);
        tabLayout.setTabIndicatorFullWidth(false);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(tabNames[position]);
            }
        }).attach();
        return view;
    }
}
