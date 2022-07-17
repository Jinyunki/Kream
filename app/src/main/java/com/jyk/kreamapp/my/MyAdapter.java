package com.jyk.kreamapp.my;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.jyk.kreamapp.my.profile.MyProfileFragment;
import com.jyk.kreamapp.my.shopping.MyShoppingFragment;

public class MyAdapter extends FragmentStateAdapter {

    public MyAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0){
            return new MyShoppingFragment();
        } else {
            return new MyProfileFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}