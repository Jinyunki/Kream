package com.jyk.kreamapp.style.following.capture;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class StyleFollowingCaptureAdapter extends FragmentStateAdapter {
    int pageCount;

    public StyleFollowingCaptureAdapter(FragmentActivity fragmentActivity, int pageCount) {
        super(fragmentActivity);
        this.pageCount = pageCount;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return new StyleFollowingCaptureFragment();
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
