package com.jyk.kreamapp.home.today.banner.adapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

// 뷰페이저 안에 들어갈 프래그먼트를 담아줄 어댑터
public class HomeBannerPagerAdapter extends FragmentStateAdapter {
    // 뷰페이저 내부에 들어갈 프래그먼트갯수를 카운트하기위함
    int mCount;

    // 리사이클러뷰 어댑터에서 호출해주기위한 생성자(뷰페이저를 쓰기위한 파라미터타입)
    public HomeBannerPagerAdapter(FragmentManager fragmentManager, Lifecycle lifecycle, int mCount) {
        super(fragmentManager, lifecycle);
        this.mCount = mCount;
    }

    @NonNull
    @Override
    // 번들을 생성해주고 , putInt값으로 , 해당 포지션을 불러오는 과정
    // FirstPageViewpagerItemFrag1의 번들타입 생성자를 참고하여 반환
    public Fragment createFragment(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        return HomeBannerFragment.getInstance(bundle);
    }

    @Override
    // 페이지 갯수
    public int getItemCount() {
        return 3;
    }
}
