package com.jyk.kreamapp.home;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.jyk.kreamapp.home.today.HomeTodayFragment;
import com.jyk.kreamapp.home.info.HomeInfoFragment;

// Viewpager2 어댑터는 FragmentStateAdapter를 상속 받는다
public class HomeAdapter extends FragmentStateAdapter {
    // 메인 Viewpager의 position 갯수를 지정하기위한 준비
    int pageCount;
    // 외부에서 호출해주기위한 메서드
    public HomeAdapter(@NonNull FragmentActivity fragmentActivity, int pageCount) {
        super(fragmentActivity);
        this.pageCount = pageCount;
    }

    @NonNull
    @Override
    // 뷰페이저에 들어갈 item을 가지고있는 프래그먼트 생성 후 포지션 지정
    public Fragment createFragment(int position) {
        if (position == 0){
            return new HomeTodayFragment();
        } else {
            return new HomeInfoFragment();
        }
    }

    @Override
    // 뷰페이저의 갯수
    public int getItemCount() {
        return 2;
    }
}
