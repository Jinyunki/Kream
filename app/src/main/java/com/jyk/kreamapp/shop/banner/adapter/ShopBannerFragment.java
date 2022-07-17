package com.jyk.kreamapp.shop.banner.adapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.jyk.kreamapp.R;

public class ShopBannerFragment extends Fragment {
    TextView textView;
    int position;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.position = getArguments().getInt("position");

        View view = inflater.inflate(R.layout.fragment_shop_banner_item,container,false);
        textView = view.findViewById(R.id.tv_banner_item);
        textView.setText("" + position);

        return view;
    }

    public static ShopBannerFragment getInstance(Bundle bundle) {
        return new ShopBannerFragment(bundle);
    }

    public ShopBannerFragment() { }
    public ShopBannerFragment(Bundle bundle) {
        setArguments(bundle);
    }
}
