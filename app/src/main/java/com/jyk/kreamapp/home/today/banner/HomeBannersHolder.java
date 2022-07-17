package com.jyk.kreamapp.home.today.banner;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.jyk.kreamapp.R;
import com.jyk.kreamapp.home.today.banner.adapter.HomeBannerFragment;

public class HomeBannersHolder extends RecyclerView.ViewHolder {
    // 뷰페이저 사용 준비
    public ViewPager2 viewPager2;

    public HomeBannersHolder(@NonNull View itemView) {
        super(itemView);
        // 어댑터에서 view로 불러온 layout의 내부에 viewpager를 호출
        viewPager2 = itemView.findViewById(R.id.vp_firstPage);
    }
}
