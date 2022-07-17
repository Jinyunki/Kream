package com.jyk.kreamapp.home.today.banner.adapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.jyk.kreamapp.R;

// 하나의 프래그먼트로 같은패턴의 아이템을 불러올때
public class HomeBannerFragment extends Fragment {
    TextView textView;
    int position;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // 포지션에 담길것은 , 데이터가 담긴 Arguments를 호출, 해당 포지션이 int값이기 때문에 getInt를 사용
        this.position = getArguments().getInt("position");
        View view = inflater.inflate(R.layout.fragment_home_banner,container,false);
        textView = view.findViewById(R.id.tv_home_banner_item);
        textView.setText(String.valueOf(position));

        return view;
    }

    // 프래그먼트 어댑터에서 편리하게 호출하기 위하여 , 생성
    // 계속하여 new키워드로 생성할 필요없이 현재 골자를 그대로 가져가게된다
    // 번들은 무언가를 담아주는 바구니같은 역할을 하게된다
    public static HomeBannerFragment getInstance(Bundle bundle) {
        return new HomeBannerFragment(bundle);
    }
    // 기본생성자
    // setArguments() = 데이터타입을 담아주기위하여 사용함
    public HomeBannerFragment() { }
    public HomeBannerFragment(Bundle bundle) {
        setArguments(bundle);
    }
}
