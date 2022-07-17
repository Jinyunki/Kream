package com.jyk.kreamapp.shop.banner.adapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ShopBannerAdapter extends FragmentStateAdapter {
    int mCount;

    public ShopBannerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, int mCount) {
        super(fragmentManager, lifecycle);
        this.mCount = mCount;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        return ShopBannerFragment.getInstance(bundle);
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
